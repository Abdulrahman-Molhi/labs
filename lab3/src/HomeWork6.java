import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {

                int num1,num2,num3;
                Scanner in=new Scanner(System.in);
                System.out.println("please enter three number in roll:");
                num1=in.nextInt();
                num2=in.nextInt();
                num3=in.nextInt();
                if(num1<num2&&num2<=num3)
                    System.out.println("in order");
                else if (num1>num2&&num2>=num3)
                    System.out.println("in order");
                else
                    System.out.println("not in order");

            }
}
