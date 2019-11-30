import java.awt.*;
import java.awt.event.*;

class second_frame extends Frame implements ActionListener
{
	Button b;
	
	second_frame()
	{
		setLayout(new FlowLayout());
		
		b=new Button("back");
		
		add(b);
		
		b.addActionListener(this);
	
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		this.dispose();
	}
}