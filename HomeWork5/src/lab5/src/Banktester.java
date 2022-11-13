public class Banktester {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(400);
        System.out.println("expected balance is 100");
        System.out.println(acc.getBalance());
        acc.deposit(900);
        acc.addInterest(10);
        System.out.println(acc.getBalance());

    }
}
