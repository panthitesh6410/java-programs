package Arithmetic;
public class Addition
{
	/** this class is used for addition of any tw numbers */
	private double num1, num2;
	
	public Addition(double a, double b)		//constructor
	{
		/** Addition is a constructor to initialise values */
		num1 = a;
		num2 = b;
	}
	
	public void sum()
	{
	/** this void sum() method shows the output of sum */
		System.out.println(num1+num2);
	}
}					