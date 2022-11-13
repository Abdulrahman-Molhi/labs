public class SavingAccounts {
    private double  balance;
    private double interest;

    public SavingAccounts(double intialize,double interest ){
        balance=intialize;
        this.interest=interest; }

    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest()
    {
        balance=((this.interest/100)*balance)+balance;

    }
}
