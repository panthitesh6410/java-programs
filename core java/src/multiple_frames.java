import java.awt.*;
import java.awt.event.*;

public class multiple_frames extends Frame implements ActionListener 
{
    Button b1,b2;
    multiple_frames()
    {
        setLayout(new FlowLayout());
        b1=new Button("CLOSE");
        b2=new Button("NEXT");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        this.addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent we)
           {
               System.exit(0);
           }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
            System.exit(0);
        else
        {
            other_frame f2=new other_frame();
            f2.setTitle("frame 2");
            f2.setSize(600,600);
            f2.setVisible(true);
        }
    }
    public static void main(String arfs[])
    {
        multiple_frames f1=new multiple_frames();
        f1.setTitle("frame 1");
        f1.setSize(400,400);
        f1.setVisible(true);
    }
}

class other_frame extends Frame implements ActionListener
{
    Button b;
    other_frame()
    {
        setLayout(new FlowLayout());
        b=new Button("BACK");
        add(b);
        b.addActionListener(this);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
            this.dispose();
    }
}
