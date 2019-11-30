import Arithmetic.Addition;

class UseArithmetic2
{
	public static void main(String arfs[])
	{
		double num1 = 23.3;
		double num2 = 34.45;
		
		Addition obj = new Addition(num1,num2);
		obj.sum();
	}
}