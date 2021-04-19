package labor9_2;

import labor9_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee person){
        employees.add(person);
    }
    public void hireAll(String filename){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found" + filename);
            System.exit(1);
        }
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            if(row.isEmpty()){
                continue;
            }
            String[] elements = row.split(",");
            if(elements.length == 6){
                employees.add(new Employee(elements[0], elements[1], Double.parseDouble(elements[2].trim()),new MyDate(Integer.parseInt(elements[3].trim()),Integer.parseInt(elements[4].trim()),Integer.parseInt(elements[5].trim()))));
            }
            else{
                employees.add(new Manager(elements[0], elements[1], Double.parseDouble(elements[2].trim()),new MyDate(Integer.parseInt(elements[3].trim()),Integer.parseInt(elements[4].trim()),Integer.parseInt(elements[5].trim())), elements[6]));
            }
        }
    }
    public void fire(int n){
        employees.remove(employees.get(n));
    }

    public void printAll(PrintStream ps){
        for(Employee e:employees){
            System.out.println(e);
        }
    }

    public void printManagers(PrintStream ps){
        for(Employee e:employees){
            if(e instanceof Manager){
                System.out.println(e);
            }
        }
    }

    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(employees, comp);
    }
}
