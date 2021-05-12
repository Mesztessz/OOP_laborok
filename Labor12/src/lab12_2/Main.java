package lab12_2;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Storage storage1 = new Storage("OOP laborok/Labor12/data1000000.txt");
        storage1.update("OOP laborok/Labor12/update1000000.txt");
        long endTime = System.nanoTime();

        long elapsed = endTime - startTime;
        System.out.println("\nExecution in miliseconds: " +elapsed/1000000);


    }
}
