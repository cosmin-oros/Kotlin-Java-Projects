package Animation2d;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    final int panelWidth = 500;
    final int panelHeight = 500;
    Image anim;
    Image background;
    Timer timer;
    int xVelocity=1;
    int yVelocity=1;
    int x=0;
    int y=0;

    MyPanel(){
        this.setPreferredSize(new Dimension(panelWidth,panelHeight));
        this.setBackground(Color.black);
        anim = new ImageIcon("anim.jpg").getImage();
        timer = new Timer(10,null);

    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D G2D = (Graphics2D) g;
        G2D.drawImage(anim,x,y,null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x>=panelWidth) {
            xVelocity*=-1;
        }
        x+=xVelocity;
        repaint();
    }
}
