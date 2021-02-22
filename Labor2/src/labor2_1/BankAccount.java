package labor2_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // inicializal
    public BankAccount(String accountNumber){
        // shadowing - elfedes
        //accountNumber parameter - lokalis valtozo
        //this.accountNumber - attributum(adattag)
        this.accountNumber = accountNumber;
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
}
