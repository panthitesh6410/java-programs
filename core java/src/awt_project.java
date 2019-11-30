import java.awt.*;
import java.awt.event.*;

public class awt_project extends Frame implements ActionListener, ItemListener 
{
    String s1,s2,s3,s4,s5,s6,s7;
    TextField t1,t2,t3,t4;
    Label l1,l2,l3,l4;
    Checkbox c1,c2;
    Choice c;
    Button b1,b2;
    
    awt_project()
    {
        setLayout(null);
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();
        c1=new Checkbox("Male");
        c2=new Checkbox("Female");
        c=new Choice();
        c.add("Hindi");
        c.add("English");
        c.add("Spanish");
        c.add("German");
        c.add("Chinese");
        c.add("Korean");
        c.add("Kumauni");
        c.add("Punjabi");
        c.add("Bengali");
        c.add("Malyali");
        b1=new Button("SUBMIT");
        b2=new Button("CLOSE");
        l1=new Label("label1",Label.LEFT);
        l2=new Label("label2",Label.LEFT);
        l3=new Label("label3",Label.LEFT);
        l4=new Label("label4",Label.LEFT);
        
        b1.setBounds(300,300,100,100);
        b2.setBounds(300,330,100,100);
        
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(c1);
        add(c2);
        add(c);
        add(b1);
        add(b1);
        
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c.addItemListener(this);
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
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            next_section ns=new next_section();
            ns.setSize(500,500);
            ns.setTitle("next section");
            ns.setVisible(true);
        }
        else
        {
            System.exit(0);
        }
    }
    public void paint(Graphics g)
    {
        if(c1.getState())
            g.drawString("selected gender : Male",100,100);
        else if(c2.getState())
            g.drawString("selected gender : Female", 100, 120);
        
        g.drawString("Selected Language ="+c.getSelectedItem(),200,200);
    }
    public static void main(String arfsp[])
    {
      awt_project obj=new awt_project();
      obj.setTitle("SIGN UP");
      obj.setSize(600,600);
      obj.setVisible(true);
    }
}

class next_section extends Frame implements ActionListener
{
    Button btn1,btn2;
    next_section()
    {
        setLayout(null);
        btn1=new Button("BACK");
        btn2=new Button("EXIT");
    
        add(btn1);
        add(btn2);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
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
       if(ae.getSource()==btn1)
           this.dispose();
       else
           System.exit(0);
    }
}