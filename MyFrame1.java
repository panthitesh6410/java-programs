import java.awt.*;
import java.awt.event.*;
public class MyFrame1 
{
    public static void main(String args[])
    {
        Frame f = new Frame("MyFrame1");
        f.setSize(2024,1024);
        f.setVisible(true);
        f.addWindowListener(new MyClass()
	 {

            
            public void windowOpened(WindowEvent e) {

            }

            
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }


            public void windowClosed(WindowEvent e) {

            }

           
            public void windowIconified(WindowEvent e) {

            }


            public void windowDeiconified(WindowEvent e) {

            }


            public void windowActivated(WindowEvent e) {

            }


            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
abstract class MyClass implements WindowListener
{
    public void WindowActivated(WindowEvent e){}
    public void WindowClosed(WindowEvent e){}
    public void WindowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void WindowDeactiavted(WindowEvent e){}
    public void WindowDeIconified(WindowEvent e){}
    public void WindowIconified(WindowEvent e){}
    public void WindowOpedned(WindowEvent e){}
}
