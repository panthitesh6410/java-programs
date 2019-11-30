class ExceptionHandling1
{
	public static void main(String args[])
	{
		try
		{
			int n = args.length;
			int a = 1 / n;
			System.out.println("a=" + a);
       		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("please provide some argumnets");
		}
		finally
		{
			System.out.println("END");	
		}
	}
}		
	