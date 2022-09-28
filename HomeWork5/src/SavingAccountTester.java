public class SavingAccountTester {
    public static void main(String[] args) {
        SavingAccounts x=new SavingAccounts(1000,10);
        x.addInterest();
        System.out.println("expected result is 1100");
        System.out.println(x.getBalance());
    }
}
