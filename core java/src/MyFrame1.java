import java.awt.*;
import java.awt.event.*;
public class MyFrame1 
{
    public static void main(String args[])
    {
        Frame f = new Frame("MyFrame1");
        f.setSize(2024,1024);
        f.setVisible(true);
        f.addWindowListener(new MyClass() {

            @Override
            public void windowOpened(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
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
