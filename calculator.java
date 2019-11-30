//implementation of calculator package:

import java.util.Scanner;
import calculator.*;

class calculator
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);	

		int num1,num2;
		System.out.println("enter 2 numbers:");
		num1=key.nextInt();
		num2=key.nextInt();
		
		calc obj1=new calc();
		calc obj2=new calc();
		calc obj3=new calc();
		calc obj4=new calc();
	
		obj1.addition(num1,num2);
		obj2.subtraction(num1,num2);
		obj3.multiplication(num1,num2);
		obj4.division(num1,num2);
	}
}		