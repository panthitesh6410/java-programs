import java.awt.*;
import java.awt.event.*;

class choice extends Frame implements ItemListener
{
	Choice ch;
	choice()
	{
		setLayout(new FlowLayout());
		ch=new Choice();
		ch.add("english");	
		ch.add("hindi");
		ch.add("bengali");
		ch.add("kumauni");
		ch.add("telegu");
		ch.add("kannada");
		ch.add("french");
		ch.add("german");
		ch.add("spanish");
		ch.add("chinese");	
		add(ch);
		ch.addItemListener(this);
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
		repaint();		//calling paint method.
	}
	public void paint(Graphics g)
	{
		g.drawString("selected language : "+ch.getSelectedItem(),200,200);
	}
	public static void main(String argss[])
	{
		choice c=new choice();
		c.setTitle("choices");
		c.setSize(500,600);
		c.setVisible(true);
	}
}