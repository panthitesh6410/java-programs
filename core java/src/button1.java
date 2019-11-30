import java.awt.*;
import java.awt.event.*;

class Button1 extends Frame implements ActionListener
{
	Button1()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}	
		});
		
		this.setLayout(null);
			
		Button b1=new Button("red");
		Button b2=new Button("black");
		Button b3=new Button("green");
		
		b1.setBounds(100,100,100,100);
		b2.setBounds(100,160,100,100);
		b3.setBounds(100,220,100,100);
		
		add(b1);
		add(b2);
		add(b3);		

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		
		if(str.equals("red"))
                    setBackground(Color.red);
                if(str.equals("black"))
			setBackground(Color.black);	
		if(str.equals("green"))
			setBackground(Color.green);		
	}
	
	public static void main(String args[])
	{
		Button1 obj=new Button1();
		obj.setSize(400,400);
		obj.setTitle("Buttons");
		obj.setVisible(true);
	}
}