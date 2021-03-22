package labor6_1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank ("OTP");
        bank.addCustomer(new Customer("Bagoly", "Norbert"));
        bank.addCustomer(new Customer("Bagoly", "Attila"));
        bank.getCustomers(1).addAccount(new SavingsAccount(0.15));
        bank.getCustomers(1).addAccount(new CheckingAccount(2000));
        bank.getCustomers(2).addAccount(new SavingsAccount(0.15));
        bank.getCustomers(2).addAccount(new CheckingAccount(2000));
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(0)).deposit(825);//"OTP0000001"
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(1)).deposit(1538);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(0)).deposit(1652);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(1)).deposit(2123);
        System.out.println(bank.getCustomers(1));
        System.out.println(bank.getCustomers(2));
        BankAccount account =  bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(0));
        ((SavingsAccount)account).addInterest();
        account = bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(0));
        ((SavingsAccount)account).addInterest();
        System.out.println(bank.getCustomers(1));
        System.out.println(bank.getCustomers(2));
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(0)).withdraw(500);
        bank.getCustomers(1).getAccount(bank.getCustomers(1).getAccountNumbers().get(1)).withdraw(3700);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(0)).withdraw(3541);
        bank.getCustomers(2).getAccount(bank.getCustomers(2).getAccountNumbers().get(1)).withdraw(752);
        System.out.println(bank.getCustomers(1));
        System.out.println(bank.getCustomers(2));
    }
}
