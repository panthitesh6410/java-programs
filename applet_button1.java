// Buttons in applet:

import java.awt.*;
import java.applet.*;;

//<applet code="applet_button1.class"width="300"height="300"></applet>

public class applet_button1 extends Applet
{
	Button btn=new Button("OK");
	
	public void init()
	{
		add(btn);
	}
}