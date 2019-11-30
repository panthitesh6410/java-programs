import java.awt.*;
import java.awt.event.*;

public class draw2 extends Frame 
{
    draw2()
    {
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(800,10,200,200);
        g.drawLine(800,200,200,200);
        g.setColor(Color.green);
        g.fillRect(1000,50,300,300);
        g.setColor(Color.blue);
        g.fillRoundRect(1500,50,400,200,80,80);
        g.setColor(Color.ORANGE);
        g.fillOval(200, 500, 200, 200);
        g.setColor(Color.darkGray);
        g.fill3DRect(600, 400, 400, 300, false);
    }
    public static void main(String args[])
    {
        draw2 d = new draw2();
        d.setTitle(" colored drawing ");
        d.setSize(1990,1024);
        d.setVisible(true);
    }
}
