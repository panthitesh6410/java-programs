//illustrate hierarchical inhertiance:

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
class C extends A
{
	public static void fun3()
	{
		System.out.println("class C");
	}
}
class hierarchical_inhertiance
{
	public static void main(String args[])
	{
		C obj1=new C();
		B obj2=new B();
		obj1.fun1();
		obj2.fun1();
	}	
}