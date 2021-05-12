package lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DataProcessing {
    private Map<Integer, Student> students = new HashMap<>();
    private ArrayList<Student> failed = new ArrayList<>();

    public DataProcessing(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] elements = row.split(" ");
                int ID = Integer.parseInt(elements[0].trim());
                students.put(ID, new Student(ID, elements[1], elements[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void matekJegyek(String filename){
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] elements = row.split(" ");
                int ID = Integer.parseInt(elements[0].trim());
                students.get(ID).setMatek(Double.parseDouble(elements[1].trim()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void magyarJegyek(String filename){
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] elements = row.split(" ");
                int ID = Integer.parseInt(elements[0].trim());
                students.get(ID).setMagyar(Double.parseDouble(elements[1].trim()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void romanJegyek(String filename){
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] elements = row.split(" ");
                int ID = Integer.parseInt(elements[0].trim());
                students.get(ID).setRoman(Double.parseDouble(elements[1].trim()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void BAC(){
        for(int id : students.keySet()){
            students.get(id).setAtlag();
        }

        int counter = 0;
        for(int id : students.keySet()){
            if(students.get(id).getRoman() >=5 && students.get(id).getMatek() >=5 &&
                    students.get(id).getMagyar() >=5 && students.get(id).getAtlag() >=6){
                counter++;
            }
            else{
                failed.add(students.get(id));
            }
        }
        System.out.println("The number of students, who have passed the BAC: " + counter);
        Collections.sort(failed, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getFirstname().compareTo(o2.getFirstname()) == 0){
                    return o1.getLastname().compareTo(o2.getLastname());
                }
                return o1.getFirstname().compareTo(o2.getFirstname());
            }
        });

        System.out.println("The list of students, who have failed the BAC:");
        for(Student e : failed){
            System.out.println(e.toString());
        }
    }

}

