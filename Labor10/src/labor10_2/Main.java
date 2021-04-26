package labor10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = null;
        PrintStream stream = null;
        try {
            scanner = new Scanner(new File("students.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File opening error");
            System.exit(1);
        }
        try {
            stream = new PrintStream("warnings.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        }
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            String[] elements = row.split(",");
            if(elements.length != 7){
                System.out.println("Incomplete line: "+ row);
                continue;
            }
            int credits;
            try{
                credits = Integer.parseInt(elements[3].trim());
            } catch(NumberFormatException e){
                System.out.println("Number format exception:" + elements[3].trim());
                continue;
            }
            int year, month, day;
            try{
                year = Integer.parseInt(elements[4].trim());
            } catch(NumberFormatException e){
                System.out.println("Number format exception: " + row + " " + elements[4]);
                continue;
            }
            try{
                month = Integer.parseInt(elements[5].trim());
            } catch(NumberFormatException e){
                System.out.println("Number format exception: " + row + " " + elements[5]);
                continue;
            }
            try{
                day = Integer.parseInt(elements[6].trim());
            } catch(NumberFormatException e){
                System.out.println("Number format exception: " + row + " " + elements[6]);
                continue;
            }
            if(!DateUtil.isValidDate(year, month, day)){
                System.out.println("Invalid date: " + year + " " + month + " " + day);
                continue;
            }
            if(credits < 30){
                stream.println(row);
            }
        }
    }
}
