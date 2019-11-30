// add two numbers using constructor:

import java.util.Scanner;
class add
{
	add()
	{
		Scanner key=new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("enter two numbers");
		num1=key.nextInt();
		num2=key.nextInt();
		sum=num1+num2;
		System.out.println("sum is:"+sum);
	}
}
class constructor2
{
	public static void main(String args[])
	{
		add obj=new add();
	}
}		