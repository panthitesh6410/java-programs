//function having arguements returning nothing:

class f2
{
	public void factorial(int num)					//function having arguements returning nothing
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is = "+fact);		
	}
	public static void main(String args[])
	{
		f2 obj = new f2();
		obj.factorial(5); 
	}
}