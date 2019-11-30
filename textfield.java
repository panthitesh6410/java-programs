import java.awt.*;
import java.awt.event.*;

class textfield extends Frame implements ActionListener
{
	String str1,str2;
	Button b;
	Label n, p;
	TextField name,pass;
	textfield()
	{
		setLayout(new FlowLayout());
		
		//add labels :
		n=new Label("Name : ", Label.LEFT);
		p=new Label("Passsword : ",Label.LEFT);
		
		//adding button :
		b=new Button("submit");
		add(b);
		b.addActionListener(this);
		
		//create textfields :
		name=new TextField(30);
		pass=new TextField(30);
		//hide password field :
		pass.setEchoChar('*');

		name.setBackground(Color.pink);
		pass.setBackground(Color.blue);

		//adding font style :
		Font f=new Font("SansSerif",Font.ITALIC,30);
		name.setFont(f);
		
		add(n);
		add(name);
		add(p);
		add(pass);
	
		name.addActionListener(this);
		pass.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			str1=name.getText();
			str2=pass.getText();
			
			Graphics g=this.getGraphics();	//creating Graphics object.
				
			g.drawString("Name = "+str1,100,100);
			g.drawString("Password="+str2,100,200);
		}
	}
	public static void main(String args[])
	{
		textfield t=new textfield();
		t.setSize(500,500);
		t.setTitle("textfields and labels");
		t.setVisible(true);
	}
}
