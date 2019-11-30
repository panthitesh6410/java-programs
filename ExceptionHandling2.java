class ExceptionHandling2
{
	public static void main(String args[])
	{
		try
		{
			int n=args.length;
			int a=1/n;
			System.out.println("a="+a);
			int arr[]={1,2,3};
			arr[45]=44;	
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException aio)	
		{
			System.out.println(aio);
			System.out.println("check the size of array");
		}
		finally
		{
			System.out.println("END");
		}
	}
}