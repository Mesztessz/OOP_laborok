package Labor3_2;

public class Customer {
    private String firstName;
    private String lastName;
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

    public void addAccount(BankAccount account){
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

    public BankAccount getAccount(String accountNumber) {
        for(int i = 0; i < numAccounts; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return accounts[0];
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void closeAccount(int accountNumber){
        if(accounts[accountNumber] == null){
            System.out.println("Invalid account number");
        }
        else{
            numAccounts --;
            accounts[accountNumber] = null;
            for(int i = accountNumber; i < numAccounts; i++){
                accounts[i] = accounts[i+1];
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }
}
