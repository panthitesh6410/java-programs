import java.awt.*;
import java.applet.Applet;

public class applet2 extends Applet {

    public void init()      //initialization
    {
        TextField t1=new TextField(30);     //creating textfiled box
        TextField t2=new TextField(30);
        Button b1=new Button("click");      //creating a button
        
        add(t1);        //adding to display.
        add(t2);
        add(b1);
    }
}
