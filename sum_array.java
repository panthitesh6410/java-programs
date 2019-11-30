// sum of array elements:

import java.util.Scanner;
class sum_array
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		int arr[];
		arr=new int[5];
		int sum=0,i;
		System.out.println("enter 5 numbers into array:");
		for(i=0;i<5;i++)
		{
			arr[i]=key.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of array elements="+sum);
	}
}

		
		