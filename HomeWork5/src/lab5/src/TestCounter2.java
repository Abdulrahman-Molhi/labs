public class TestCounter2 {
    public static void main(String[] args) {
        TallyCounter2 x=new TallyCounter2();
        x.setLimit(5);
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        System.out.println(x.getClick());


    }
}
