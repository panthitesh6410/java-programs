//types of constructor:

class const1
{
	String name;
	int roll;

	const1()				// Default Constructor.
	{
		name="null";
		roll=0;
	}	
	
	const1(String n, int r )			//parameterized constructor.
	{
		name = n;
		roll = r;
	}

	const1(const1 c)			//copy constructor.
	{
		name = c.name;
		roll = c.roll;	
	}

	void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("Roll.no. is : "+roll);	
	}
	
	public static void main(String args[])
	{
		const1 s1 = new const1();
		const1 s2 = new const1("Hitesh", 25);
		const1 s3 = new const1(s2);
		System.out.println("default constructor:"); 
		s1.display();
		System.out.println("parameterized constructor:");
		s2.display();
		System.out.println("copy constructor:");
		s3.display();
	}
}