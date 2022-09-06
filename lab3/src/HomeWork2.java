
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int num ;
        Scanner in=new Scanner(System.in);

        System.out.println("please enter any number :");
       num=in.nextInt();
        if(num>0)
            //JOptionPane
            System.out.println("the number you entered is positive ");
        else if(num<0)
            System.out.println("the number you entered is negative ");
        else
            System.out.println("the number you entered is zero");

    }
}
