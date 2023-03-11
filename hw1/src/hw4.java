import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        int [] numbers=new int[10];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
           numbers[i]=in.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
