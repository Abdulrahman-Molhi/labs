import java.util.Scanner;

public class HomeWork2_6 {
    public static void main(String[] args) {
        int n,sq,cube;
        double f;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        sq=n*n;
        System.out.println("the square of"+n+"="+sq);
        cube=n*n*n;
        System.out.println("the cube of"+n+"="+cube);
        f=Math.pow(n,4);
        System.out.println("the fourth power of"+n+"="+f);



     }
}
