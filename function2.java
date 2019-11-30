//pprigram to add 2 numbers using function accepting arguments with returning value:

import java.util.Scanner;

class function2
{
	
	public static int add(int num1,int num2)
	{
		int sum;
		sum=num1+num2;
		return(sum);
	}
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		int num1,num2;
		System.out.println("enter 2 numbers:");
		num1=key.nextInt();
		num2=key.nextInt();
		System.out.println("sum is:"+add(num1,num2));
	}
}
		