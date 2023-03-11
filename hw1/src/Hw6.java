import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        int [] n=new int[12];
        input(n,12);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
    static void input(int [] array,int size)
    {
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <size ; i++) {
            array[i]=in.nextInt();
        }
    }

}
