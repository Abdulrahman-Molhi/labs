import java.util.Scanner;

public class HomeWork2_4 {
    public static void main(String[] args) {
        //area of rectangle equals length multiply by width.
       //perimeter of rectangle equalS (W+L)*2
        double l,w;
        Scanner in=new Scanner(System.in);
        System.out.print("please enter the length of your rectangle:");
        l=in.nextDouble();
        System.out.print("please enter the width of your rectangle:");
        w=in.nextDouble();
        System.out.println("the area of your rectangle="+(l*w));
        System.out.println("the perimeter of your rectangle="+((l+w)*2));

          }
}
