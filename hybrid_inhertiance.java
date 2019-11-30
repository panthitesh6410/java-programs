// HYBRID INHERITANCE:	

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
class D extends B
{
	public static void fun4()
	{
		System.out.println("class D");
	}
}
class hybrid_inhertiance
{
	public static void main(String args[])
	{
		B obj1=new B();
		C obj2=new C();
		D obj3=new D();
		
		obj1.fun1();
		obj2.fun2();
		
		obj2.fun2();
		obj3.fun2();
	}	
}