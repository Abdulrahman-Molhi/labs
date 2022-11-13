public class BankAccount {
    private double  balance;
    public BankAccount(double intialize ){
        balance=intialize;
    }
    public BankAccount(){
        balance=0;
    }

    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest(double interest)
    {
        balance=((interest/100)*balance)+balance;

    }
}
