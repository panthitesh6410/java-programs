//function having arguements and returning value:

import java.util.Scanner;
class f3
{
	public int addition(int num1,int num2)				//function having arguements and returning value
	{
		return(num1+num2);
			
	} 
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);	
		f3 obj = new f3();
		int num1=key.nextInt();
		int num2=key.nextInt();
		int sum = obj.addition(num1,num2);
		System.out.println("sum is : "+sum);
	}
}