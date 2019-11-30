//priority in thread:
	
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("i="+i);
		}	
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("j="+j);
		}
	}
}
class PriorityInThread
{
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
		
		obj1.setPriority(10);
		obj2.setPriority(1);

		obj1.start();
		obj2.start();
	}
}