//program to add two numbers using function with no argumentns and no returntype:

import java.util.Scanner;

class function1
{
	
	public static void add()
	{
		Scanner key=new Scanner(System.in);

		int num1,num2,sum;
		System.out.println("enter two numbers:");	
		num1=key.nextInt();
		num2=key.nextInt();
		sum=num1+num2;
		System.out.println("sum="+sum);
	}
	
	public static void main(String args[])
	{
		add();
	}
}