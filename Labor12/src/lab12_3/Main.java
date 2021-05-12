package lab12_3;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        DataProcessing students = new DataProcessing("OOP laborok/Labor12/nevek1.txt");
        students.magyarJegyek("OOP laborok/Labor12/magyar.txt");
        students.romanJegyek("OOP laborok/Labor12/roman.txt");
        students.matekJegyek("OOP laborok/Labor12/matek.txt");
        students.BAC();
        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;
        System.out.println("Time elapsed in miliseconds: " + elapsed/1000000);
    }
}
