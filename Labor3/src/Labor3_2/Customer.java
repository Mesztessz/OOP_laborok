package Labor3_2;

import Labor3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;
    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts=0;
    private BankAccount accounts[] = new BankAccount [MAX_ACCOUNTS];

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void addAccount(BankAccount accounts){
        if(numAccounts > 9){
            return;
        }
        else{
            this.accounts[numAccounts] = account;
            numAccounts++;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void closeAccount(){
        numAccounts --;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
