package labor6_1;

import java.util.ArrayList;

public class Customer {
    private static int numCustomers;
    private final int id;
    public static int counter = 0;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        ++counter;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accountNumbers = new ArrayList<>();
        for(BankAccount account : accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public void addAccount(BankAccount account){
        if(account != null){
            accounts.add(account);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for(BankAccount account: accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                accounts.remove(account);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer(id + " ");
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<accounts.size(); ++i){
            result.append( "\t" + accounts.get(i).toString() +"\n");
        }
        return result.toString();
    }
}
