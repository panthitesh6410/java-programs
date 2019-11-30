import java.awt.*;
import java.awt.event.*;

class points extends Frame
{
	points()
	{
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		for( ; ; )
		{
			int x= (int)(Math.random()*800);
			int y=(int)(Math.random()*600);
			g.drawLine(x,y,x,y);
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException ie)
			{
					
			}
		}		
	}
	public static void main(String args[])
	{
		points obj=new points();
		obj.setBackground(Color.black);
		obj.setSize(500,400);
		obj.setTitle("points");
		obj.setVisible(true);		
	}
}
