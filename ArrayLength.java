//to find the length of an array:

import java.io.*;
//import java.util.Scanner;
public class ArrayLength 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        //Scanner key=new Scanner(System.in);
        //int n=key.nextInt();
        System.out.println("enter size of array:");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int length=arr.length;              // "arrayname.length" is syntax to find length of an array.
        System.out.println("length of array="+length);
    }
}
