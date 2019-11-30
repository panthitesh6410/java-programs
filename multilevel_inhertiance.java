//multi-level inheritance:

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
class C extends B
{
	public static void fun3()
	{
		System.out.println("class C");
	}
}
class multilevel_inhertiance
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.fun1();
		obj.fun2();
		obj.fun3();
	}
}		