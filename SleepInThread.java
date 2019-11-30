class A extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			if(i==3)
			{
				try
				{
					sleep(5000);
				}
				catch(Exception e)
				{
					
				}
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<5;j++)
		{
			System.out.println("j="+j);
		}
	}
}
class SleepInThread
{
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
		
		obj1.start();
		obj2.start();
	}
} 
	