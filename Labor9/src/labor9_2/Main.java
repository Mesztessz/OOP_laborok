package labor9_2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company ceg = new Company("Vodafone");
        ceg.hireAll("employees.csv");
        ceg.printAll(System.out);
        System.out.println();
        System.out.println("Sorted alphabetically:");
        ceg.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getFirstName().equals(o2.getFirstName())){
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        ceg.printAll(System.out);
        System.out.println();
        System.out.println("Sorted by salary:");
        ceg.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.getSalary()-o1.getSalary());
            }
        });
        ceg.printAll(System.out);
        System.out.println();
        System.out.println("Managers followed by employees");
        ceg.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getClass() == o2.getClass()){
                    if(o1.getFirstName().equals(o2.getFirstName())){
                        return o1.getLastName().compareTo(o2.getLastName());
                    }
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return 1;
            }
        });
    }
}
