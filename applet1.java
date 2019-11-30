import java.applet.Applet;
import java.awt.Graphics;

//<applet code="applet1.class"width="300"height="300"></applet>

public class applet1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("WELCOME",150,150);
	}
}