//use of conditional statements(if-else):

import java.util.Scanner;

class if_else
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		int age;
		System.out.println("enter your age:");
		age=key.nextInt();
		if(age<18)
		{
			System.out.println("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
}
