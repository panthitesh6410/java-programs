//exceptional handling:

class exceptional_handling
{
	public static void main(String arsf[])
	{
		try
		{
			int num1 = 50;
			int num2 = 0;
			int output = num1/num2;
			System.out.println("result="+output); 	
		}
		catch(ArithmeticException e)
		{
			System.out.println("you should not divide by zero");	
		}
	}
}
