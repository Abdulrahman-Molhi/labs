//import javax.swing.*;
import java.util.Scanner;

public class HomeWork2_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double rad, pi=3.14159;
        System.out.println("please enter the radius of your circle:");
        rad=in.nextDouble();
        System.out.println("the area of your circle="+((rad*rad)*pi));
        System.out.println("the perimeter of your circle="+(rad*pi*2));


    }
}
