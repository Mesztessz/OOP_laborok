package labor4_1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
//        try {
//            scanner = new Scanner(new File("OOP laborok/Labor4/be.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.exit(1);
//        }
//        int lineCounter = 0;
//        while(scanner.hasNextLine()){
//            String line = scanner.nextLine();
//            ++lineCounter;
//            System.out.println(lineCounter + ". " + line);
//        }

        scanner = null;
        try {
            scanner = new Scanner(new File("OOP laborok/Labor4/lab4_1.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        ArrayList<Person> persons = new ArrayList<>();
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String [] items = line.split(",");


//            String firstName = items[0].trim();
//            String lastName = items[1].trim();
//            int birthYear = Integer.parseInt(items[2].trim());

//            persons.add(new Person(firstName, lastName, birthYear));
            persons.add(new Person(items[0].trim(), items[1].trim(), Integer.parseInt(items[2].trim())));
        }
        for(Person person: persons){
            System.out.println(person);
        }
    }
}

