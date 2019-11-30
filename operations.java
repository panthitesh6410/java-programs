//perform addition,subtraction,multiplication,division of two numbers: 

import java.util.Scanner;

class operations
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		int num1,num2,sum,sub,mul,div;
		System.out.println("enter first number:");
		num1=key.nextInt();
		System.out.println("enter second number:");
		num2=key.nextInt();
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		System.out.println("addition:"+sum);
		System.out.println("subtraction:"+sub);
		System.out.println("multiplication:"+mul);
		System.out.println("division:"+div);
	}
}
		