import Arithmetic.Subtraction;

class UseArithmetic3
{
	public static void main(String args[])
	{
		double num1=12.23, num2=12;
		
		Subtraction obj = new Subtraction(num1,num2);
		
		obj.sub();
	}
}