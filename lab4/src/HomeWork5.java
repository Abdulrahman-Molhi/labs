import java.awt.*;

public class HomeWork5 {
    public static void main(String[] args) {
       Rectangle rec=new Rectangle(5,10,20,30);
        System.out.println(rec.x);
        System.out.println(rec.y);
        System.out.println(rec.getWidth());
        System.out.println(rec.getHeight());
        rec.add(0,0);
        System.out.println(rec.x);
        System.out.println(rec.y);
        System.out.println(rec.getWidth());
        System.out.println(rec.getHeight());

    }
}
