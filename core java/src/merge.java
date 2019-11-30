import java.util.Scanner;
import java.io.*;
public class merge 
{
    public static void main(String args[])
    {
        Scanner key=new Scanner(System.in);
        int n,m,k;
        System.out.println("enter size of 1st array:");
        n=key.nextInt();
        System.out.println("enter size of 2nd array:");
        m=key.nextInt();
        k=m+n;
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr3[]=new int[k];
        System.out.println("enter elemnts in 1st array:");
        for(int i=0;i<n;i++)
            arr1[i]=key.nextInt();
        System.out.println("enter elements in 2nd array:");
        for(int j=0;j<m;j++)
            arr2[j]=key.nextInt();

        for(int i=0;i<n;i++)
        {
            arr3[i]=arr1[i];
            arr3[i+n]=arr2[i];
        }
        System.out.println("mergeed list is:");
        for(int t=0;t<k;t++)
            System.out.println(arr3[t]);
    }   
}
