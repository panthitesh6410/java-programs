import java.awt.*;
import java.awt.event.*;

class text extends Frame
{
	text()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		this.setBackground(Color.red);			//backgroundcolor
		Font f=new Font("SansSerif",Font.BOLD+Font.ITALIC,30);	//creating Font object (giving font properties )
		g.setFont(f);					//setting font (calling font object)
		g.setColor(Color.white);				//text color
		g.drawString("my name is hitesh",100,100);		//content of text with its co-ordinates
	}
	public static void main(String args[])
	{
		text t=new text();
		t.setTitle("my text");
		t.setSize(500,500);
		t.setVisible(true);
	}
}