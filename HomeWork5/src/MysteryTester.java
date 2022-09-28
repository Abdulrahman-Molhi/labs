public class MysteryTester {
    public static void main(String[] args) {
        bankMystery ahmed=new bankMystery(500);
        bankMystery mohammed=new bankMystery(1000);
       //calling mystery method
        mohammed.mystery(ahmed,500);
        System.out.println("mohammed balance="+mohammed.getBalance());
        System.out.println("Ahmed balance="+ahmed.getBalance());
    }
}