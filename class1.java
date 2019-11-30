// calling function using class object:

class x
{
	public static void fun1()
	{
		System.out.println("class x");
	}
}
class y
{
	public static void fun2()
	{
		System.out.println("class y");
	}
}
class class1					//here 'class1' is name of main class
{
	public static void main(String args[])
	{
		x obj1=new x();
		y obj2=new y();
		obj1.fun1();
		obj2.fun2();
	}
}

