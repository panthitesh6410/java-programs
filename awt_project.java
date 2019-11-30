import java.awt.*;
import java.awt.event.*;

public class awt_project extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	String s1,s2;
	Button b1;
	awt_project()
	{
		setLayout(null);
		l1=new Label("User-Name ",Label.LEFT);		
		l2=new Label("Password ",Label.LEFT);
		t1=new TextField();
		t2=new TextField();
		b1=new Button("SUBMIT");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
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
		{
			s1=t1.getText();
			s2=t2.getText();
			Graphics g=this.getGraphics();
			g.drawString("user-name = "+s1,150,300);	
			g.drawString("user-name = "+s2,200,300);
		}
	}
	public static void main(String args[])
	{
		awt_project obj1=new awt_project();
		obj1.setSize(800,1000);
		obj1.setTitle("SIGN-UP");
		obj1.setVisible(true);
	}
}