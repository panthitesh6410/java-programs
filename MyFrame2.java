import java.awt.*;
import java.awt.event.*;
public class MyFrame2 
{
    public static void main(String args[])
    {
        Frame  f=new Frame("MyFrame2");
        f.setSize(1024,720);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
                public void WindowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
        
        });
   }
}