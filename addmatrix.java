// add two matrix:

import java.util.Scanner;

class addmatrix
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		int arr1[][];
		int arr2[][];
		int arr3[][];
		arr1=new int[2][2];
		arr2=new int[2][2];
		arr3=new int[2][2];

		System.out.println("enter numbers in matrix 1:");

		arr1[0][0]=key.nextInt();
		arr1[0][1]=key.nextInt();
		arr1[1][0]=key.nextInt();
		arr1[1][1]=key.nextInt();
	
		System.out.println("enter numbers in matrix 2:");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr2[i][j]=key.nextInt();
			}
		}
		
		arr3[0][0]=arr1[0][0]+arr2[0][0];
		arr3[0][1]=arr1[0][1]+arr2[0][1];
		arr3[1][0]=arr1[1][0]+arr2[1][0];
		arr3[1][1]=arr1[1][1]+arr2[1][1];
		
		System.out.println("sum of two matrices is:");
		System.out.print(arr3[0][0]);
		System.out.print("\t"+arr3[0][1]);
		System.out.print("\n"+arr3[1][0]);
		System.out.print("\t"+arr3[1][1]);
	}
}
			
		