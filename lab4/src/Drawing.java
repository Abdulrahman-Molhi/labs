import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Drawing extends JComponent {

    public void paintComponent(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        Rectangle rec=new Rectangle(10,35,100,240);
        g2.draw(rec);
        g2.setColor(Color.GRAY);
        g2.fill(rec);
        Ellipse2D.Double circle=new Ellipse2D.Double(30,40,60,70);
        g2.draw(circle);
        g2.setColor(Color.red);
        g2.fill(circle);
        Ellipse2D.Double circle2=new Ellipse2D.Double(30,120,60,70);
        g2.draw(circle2);
        g2.setColor(Color.ORANGE);
        g2.fill(circle2);
        Ellipse2D.Double circle3=new Ellipse2D.Double(30,200,60,70);
        g2.draw(circle3);
        g2.setColor(Color.green);
        g2.fill(circle3);






    }
}
