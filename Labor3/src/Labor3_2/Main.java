package Labor3_2;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Customer customer1 = new Customer("Bagoly", "Norbert");
        Customer customer2 = new Customer("Magyari", "Dora");
        customer1.addAccount(new BankAccount("OTP0001"));
        customer1.addAccount(new BankAccount("OTP0002"));
        customer1.addAccount(new BankAccount("OTP0003"));
        customer1.addAccount(new BankAccount("OTP0004"));
        customer1.addAccount(new BankAccount("OTP0005"));
        customer2.addAccount(new BankAccount("OTP0001"));
        customer2.addAccount(new BankAccount("OTP0002"));
        customer2.addAccount(new BankAccount("OTP0003"));
        customer2.addAccount(new BankAccount("OTP0004"));
        customer2.addAccount(new BankAccount("OTP0005"));
        customer2.addAccount(new BankAccount("OTP0006"));
        customer2.addAccount(new BankAccount("OTP0007"));
        customer2.addAccount(new BankAccount("OTP0008"));
        customer2.addAccount(new BankAccount("OTP0009"));
//        System.out.println(customer1);
//        System.out.println(customer2);
        for(int i = 0; i < customer1.getNumAccounts(); i++){
            int randint = rand.nextInt(1000);
            customer1.getAccount("OTP000" + i+1).deposit(randint);
            System.out.println(customer1.getAccount("OTP000"));
        }
        for(int i = 0; i < customer2.getNumAccounts(); i++){
            int randint = rand.nextInt(1000);
            customer2.getAccount("OTP000" + i+1).deposit(randint);
        }
        System.out.println(customer1);
        System.out.println(customer2);
        customer1.closeAccount(0);
        customer2.closeAccount(1);
//        System.out.println(customer1);
//        System.out.println(customer2);
    }
}
