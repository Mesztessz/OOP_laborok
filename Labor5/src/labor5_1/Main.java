package labor5_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("Bagoly", "Norbert"));
        bank.addCustomer(new Customer("Bagoly", "Attila"));
        bank.getCustomers(1).addAccount(new BankAccount());
        bank.getCustomers(1).addAccount(new BankAccount());
        bank.getCustomers(2).addAccount(new BankAccount());
        bank.getCustomers(2).addAccount(new BankAccount());
        System.out.println(bank.getCustomers(1));
        bank.getCustomers(1).getAccount("OTP0000001").deposit(rand.nextInt(2000));
        bank.getCustomers(1).getAccount("OTP0000002").deposit(rand.nextInt(2000));
        System.out.println(bank.getCustomers(2));
        bank.printCustomersToFile("bank_customers.csv");
    }
}
