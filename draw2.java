import java.awt.*;
import java.awt.event.*;

class draw2 extends Frame
{
	draw2()		//constructor
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
		g.setColor(Color.blue);
		g.fillRect(40,40,200,200);	//fill rectangle with blue color
		g.setColor(Color.yellow);
		g.fillOval(90,70,80,80);		//fill oval wiyh yellow color
		g.setColor(Color.black);
		g.fillOval(110,95,5,5);	//fill the oval eith black color>>
		g.fillOval(145,95,5,5);	//fill the oval eith black color>>
		g.drawLine(130,95,130,115);
		g.setColor(Color.red);
		g.fillArc(113,115,35,20,0,-180);
	} 

	public static void main(String arsfs[])
	{
		draw2 d = new draw2();
		d.setSize(300,300);
		d.setTitle("color drawing");
		d.setVisible(true);
	}
}