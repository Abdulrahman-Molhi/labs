import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        int num;
        Scanner in=new Scanner(System.in);
        System.out.println("please enter the number of month\n to know the days in it: ");
       num=in.nextInt();
       if(num>0&&num<13){
        switch(num) {
            case 1:
                System.out.println("the number of days in this month:31");
                break;
            case 2:
                System.out.println("the number of days in this month:28");
                break;
            case 3:
                System.out.println("the number of days in this month:31");
                break;
            case 4:
                System.out.println("the number of days in this month:30");
                break;
            case 5:
                System.out.println("the number of days in this month:31");
                break;
            case 6:
                System.out.println("the number of days in this month:30");
                break;
            case 7:
                System.out.println("the number of days in this month:31");
                break;
            case 8:
                System.out.println("the number of days in this month:31");
                break;
            case 9:
                System.out.println("the number of days in this month:30");
                break;
            case 10:
                System.out.println("the number of days in this month:31");
                break;
            case 11:
                System.out.println("the number of days in this month:30");
                break;
            case 12:
                System.out.println("the number of days in this month:31");
                break;

        }
       }else
           System.out.println("you entered a wrong number");




    }
}
