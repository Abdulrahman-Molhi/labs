public class HomeWork2_7 {
    public static void main(String[] args) {
        String s="ahmed";
        int f;
        System.out.println("example of string"+s);
        //first ge the length of the string
        f=s.length();
        System.out.println("length="+f);
        //use the following line to get the first character the beginning index = 0,and the last index=length
        System.out.println(s.substring(0,1));
        //use the following line to get the last character the beginning index = length-1,and the last index=length
        System.out.println(s.substring(4,5));
        /*removing the first character by suspending its index, for instance, the first character index often =0,so we will
         start from index 2   by using substring method ,and last index=length */
        System.out.println(s.substring(1,5));
      /*removing the last character the following formula making the beginning index=0,the last index=length-1
        */
        System.out.println(s.substring(0,4));

    }
}
