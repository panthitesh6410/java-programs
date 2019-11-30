//interface:

interface interface1
{
	void print();
}

class interface11 implements interface1
{
	public void print()
	{
		System.out.println("this is an interface named 'interface1'");
	}
	public static void main(String args[])
	{
		interface11 obj=new interface11();
		obj.print();
	}
}