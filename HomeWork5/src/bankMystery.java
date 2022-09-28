public class bankMystery {
    private double  balance;
    public bankMystery(double intialize ){
        balance=intialize;
    }
    public bankMystery(){
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

    public void  mystery(bankMystery that, double amount)
    { this.balance = this.balance - amount;
        that.balance = that.balance + amount; }

    public void addInterest(double interest)
    {
        balance=((interest/100)*balance)+balance;

    }

}
