import java.awt.*;

public class HomeWork1 {
    public static void main(String[] args) {
        //program to test constructing a rectangular
        Rectangle box=new Rectangle(5,6);
        System.out.println("the expected value is:"+((6+5)*2));
        System.out.println("perimeter="+((box.getWidth()+box.getHeight())*2));

    }

}
