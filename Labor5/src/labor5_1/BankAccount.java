package labor5_1;

import javax.naming.PartialResultException;

public class BankAccount {
    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGHT = 10;
    private static int numAccounts = 0;
    private final String accountNumber;
    private double balance;

    // inicializal
    public BankAccount(){
        ++numAccounts;
        this.accountNumber = createAccountNumber();

    }
    private static String createAccountNumber(){
        StringBuffer str = new StringBuffer();
        String countStr = ("" + numAccounts);
        int len = countStr.length();
        str.append(PREFIX);
        for(int i = 0; i < ACCOUNT_NUMBER_LENGHT - PREFIX.length() - len; i++){
            str.append('0');
        }
        str.append(countStr);
        return str.toString();
    }

    public void deposit(double amount){
        if(amount <= 0){
            return;
        }
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }
        this.balance -= amount;
        return true;
    }

    //getter
    public String getAccountNumber(){
        return this.accountNumber;
    }

    //getter
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
