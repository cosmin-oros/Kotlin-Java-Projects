package Graphics2d;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.red);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,0,500,500);
        g2D.drawRect(0,0,100,200);
        g2D.setPaint(Color.cyan);
        g2D.fillOval(69,69,300,300);
    }
    
}
