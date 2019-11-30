import java.awt.*;
import java.awt.event.*;

public class MyImage extends Frame
{
    static Image img;
    public static void main(String args[])
    {
        MyImage obj=new MyImage();
        obj.setTitle("my image");
        obj.setSize(400,500);
        obj.setIconImage(img);
        obj.setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        g.drawImage(img,100,100,100,100,null);
    }
    MyImage()
    {
        addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent we)
           {
               System.exit(0);
           }
        });
        img=Toolkit.getDefaultToolkit().getImage("goku.png");
        MediaTracker track=new MediaTracker(this);
        track.addImage(img,0);
        try
        {
            track.waitForID(0);
        }catch(InterruptedException ie){}
    }
}
