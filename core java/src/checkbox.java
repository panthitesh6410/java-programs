import java.awt.*;
import java.awt.event.*;

class checkbox extends Frame implements ItemListener
{
	boolean b1,b2,b3;
	Checkbox c1,c2,c3;

	checkbox()
	{
		setLayout(new FlowLayout());
		
		c1=new Checkbox("Bold");
		c2=new Checkbox("Italic");
		c3=new Checkbox("Underline");
		
		add(c1);
		add(c2);
		add(c3);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);	
		
		addWindowListener(new WindowAdapter()
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
	public void paint(Graphics g)
	{
		b1=c1.getState();
		b2=c2.getState();
		b3=c3.getState();			
		
		if(b1)	
			g.drawString("Bold is selected",100,100);
		if(b2)	
			g.drawString("Italic is selected",100,200);
		if(b3)	
			g.drawString("Underline is selected",200,100);
	}
	public static void main(String args[])
	{
		checkbox c=new checkbox();
		c.setTitle("checkboxes");
		c.setSize(500,500);
		c.setVisible(true);
	}
}