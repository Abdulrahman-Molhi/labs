
import java.awt.Color;
import javax.swing.*;

public class FrameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        JLabel label = new JLabel("Hello, World!");
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,400);
        label.setText("Hello,Abdulrahman");
        label.setBackground(Color.green);
        //ImageIcon pic=new ImageIcon();




    }
}