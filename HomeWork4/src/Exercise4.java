public class Exercise4 {
    public static void main(String[] args) {
        float s=1000;
        System.out.println("the balance of your account for three years with with a 5% interest in every year:  ");
        for(int i=1;i<=3;i++)
        {  s+=(s*.05);
            System.out.println("the balance of your account after the("+i+" year)="+s+"$");
        }

    }
}
