package labor6_1;

public class SavingsAccount extends BankAccount{
    private double interestRate;//kamatlab

    public SavingsAccount(double interestRate) {
        //ososztaly konstruktor hivasa : super(...)
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        this.balance += balance*interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

}
