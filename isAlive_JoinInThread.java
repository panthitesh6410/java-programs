//use of isAlive() and join in multithreading:

class A extends Thread
{
	public void run()
	{
		System.out.println("status:"+isAlive());
	}
}
class isAlive_JoinInThread
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.start();
	
		try
		{
			obj.join();	//join() waits for a thread to die,it stop executing current thread.
		}
		catch(InterruptedException e)
		{
		}
		
		System.out.println("status:"+obj.isAlive());	//isAlive() checks the thread is alive or not.
	}
}

// A thread runs only for one time then it dies itself.