import javax.swing.*;
import java.awt.*;

public class trafficLights {
    public static void main(String[] args) {
        JFrame f = new JFrame("My frame");

        //Rect
        f.setSize(500, 500);
        Drawing s=new Drawing();
        f.add(s);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}