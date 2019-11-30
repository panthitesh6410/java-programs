class ExceptionHandling3
{
	public static void main(String args[])
	{
		try 
		{
			System.out.println("file opened.");
		
			int n= args.length;
			int a=1/n;
			System.out.println("a="+a);
			
			int arr[]={23,45};
			arr[56]=2;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("file closed.");
		}
	}
}