import java.awt.*;
import java.awt.event.*;

class first_frame extends Frame implements ActionListener
{
	Button b1,b2;
	
	first_frame()
	{
		setLayout(new FlowLayout());
		
		b1=new Button("close frame");
		b2=new Button("next frame");

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
			second_frame f2=new second_frame();
			f2.setTitle("second frame");
			f2.setSize(600,600);
			f2.setVisible(true);
		}		
	}
	public static void main(String args[])
	{
		first_frame f1=new first_frame();
		f1.setTitle("first frame");
		f1.setSize(800,800);
		f1.setVisible(true);
	} 
}


//"class second_frame" can also present in this file but i have already created another file for this.

/*class second_frame extends Frame implements ActionListener
{
	Button b;
	
	second_frame()
	{
		setLayout(new FlowLayout());
		
		b=new Button("back");
		
		add(b);
		
		b.addActionListener(this);
	
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
		this.dispose();
	}
}*/