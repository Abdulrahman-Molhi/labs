import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
      int num1,num2,num3;
      Scanner in=new Scanner(System.in);
        System.out.println("please enter three number in roll:");
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        if(num1==num2&&num2==num3)
            System.out.println("all the same");
        else if (num1!=num2&&num2!=num3&&num1!=num3)
            System.out.println("all are different");
        else
            System.out.println("neither");

    }
}
