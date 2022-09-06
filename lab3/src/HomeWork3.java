import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
      int num,count;
      Scanner in=new Scanner(System.in);
      System.out.println("please enter a number:");
       num=in.nextInt();
       if (num<0)
           num=-num;
        System.out.println("the number u entered is:-"+num);
       for(count=0;num!=0;count++)
           num/=10;

        System.out.println("the number of digits:"+count);






    }
}
