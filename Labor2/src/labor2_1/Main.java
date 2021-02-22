package labor2_1;

public class Main {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("OTP0001");
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        account1.deposit(1000);
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        boolean result = account1.withdraw(500);
        if( !result){
            System.out.println("Nincs eleg penz a bankszamlan");
        }
        if(result){
            System.out.println("Sikeres keszpenzfelvetel");
        }
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());
        result = account1.withdraw(1000);
        if( !result){
            System.out.println("Nincs eleg penz a bankszamlan");
        }
        if(result){
            System.out.println("Sikeres keszpenzfelvetel");
        }
        System.out.println(account1.getAccountNumber() + ": " + account1.getBalance());

        BankAccount account2 = new BankAccount("OTP0002");
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber() + ": " + account2.getBalance());
    }
}
