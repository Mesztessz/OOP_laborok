package labor9_2;

import labor9_1.MyDate;

public class Manager extends Employee{
    private String department;

    public Manager(String firstName, String lastName, double salary, MyDate birthDate, String department) {
        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "Manager{" +
                "ID=" + this.getID() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", salary=" + this.getSalary() +
                ", birthDate=" + this.getBirthDate() +
                ", department = " + department +
                '}';
    }
}
