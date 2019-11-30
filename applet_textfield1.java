// textfield in applet:

import java.awt.*;
import java.applet.*;

//<applet code="applet_textfield1.class"width="400"height="400"></applet>

public class applet_textfield1 extends Applet
{
	TextField t1=new TextField(30);
	TextField t2=new TextField(30);
	
	public void init()
	{
		add(t1);	
		add(t2);
	}
}