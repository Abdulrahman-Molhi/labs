import java.util.Scanner;

public class HomeWork2_5 {
    public static void main(String[] args) {
      int s,y,w;
      Scanner in=new Scanner(System.in);
        System.out.print("enter the value of s=");
       s=in.nextInt();
        System.out.print("enter the value of y=");
       y=in.nextInt();
      //  System.out.println("the value of s before swapping="+s+"\nthe value of y before swapping="+y);
        w=y;
        y=s;
        s=w;
        System.out.println("the value of s after swapping="+s+"\nthe value of y after swapping="+y);

      }
}
