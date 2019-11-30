import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame
{
	Frame2()
	{
		//close the frame :
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	//to refresh framee contents:
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawRect(40,40,200,200);	
		g.drawOval(110,95,5,5);	
		g.drawOval(145,95,5,5);
		g.drawLine(130,95,130,115);
		g.drawArc(113,115,35,20,0,-180);	
	}
	
	public static void main(String args[])
	{
		//create frame :
		Frame2 d=new Frame2();

		//display rectangle :
		d.setSize(300,300);
		d.setTitle("Drawing 1");
		d.setVisible(true);
	}
}