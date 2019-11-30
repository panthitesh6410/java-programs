//synchronozation in multithreading:

class update
{
	Synchronized void updateSum(int i)
	{
		Thread t=Thread.currentThread();
	
		for(int n=1;n<=5;n++)
		{
			System.out.println(t.getname()+":"+(1+n));
		}
	}
}
class A extends Thread
{
	update u=new update();
	
	public void run()
	{
   		u.updatesum(10);
	}
}
class SynchronizedThread
{
	public static void main(String args[])
	{
		A a=new A();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		t1.setName("Thread A");
		t2.setName("thread B");
		t1.start();
		t2.start();
	}
}