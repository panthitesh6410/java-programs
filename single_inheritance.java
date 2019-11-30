// single level inheritance:

class A
{
	public static void fun1()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	public static void fun2()
	{
		System.out.println("class B");
	}
}
class single_inheritance
{
	public static void main(String args[])
	{
		B obj1=new B();
		obj1.fun1();
		obj1.fun2();
	}
}
		
	