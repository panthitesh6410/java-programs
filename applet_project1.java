// buttons and textfields to perform some task:

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="applet_project1.class"width="500"height="500"></applet>b

public class applet_project1 extends Applet implements ActionListener
{
	TextField t1=new TextField(20);
	TextField t2=new TextField(20);
	TextField t3=new TextField(20);
	
	Button b1=new Button("click here");
	Button b2=new Button("click here");
	Button b3=new Button("click here");

	public void init()
	{
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);	

		add(t1);
		add(b1);
		add(t2);
		add(b2);
		add(t3);
		add(b3);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText("hello");
		}
		if(ae.getSource()==b2)
		{
			t2.setText("welcome");
		}
		if(ae.getSource()==b3)
		{
			t3.setText("bye");
		}
	}
}