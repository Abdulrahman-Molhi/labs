import java.util.Scanner;

public class HomeWork2_3 {
    public static void main(String[] args) {
        float x,y,v;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of x:");
        x=in.nextFloat();
        System.out.print("enter the value of y:");
        y=in.nextFloat();
        System.out.print("enter the value of v:");
        v=in.nextFloat();
        System.out.println("the average of the three numbers is:"+((x+y+v)/3.0));
    }
}
