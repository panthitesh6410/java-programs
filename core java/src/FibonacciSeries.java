//program to print fibonacci sreis:

import java.io.*;
public class FibonacciSeries 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("number of terms:");
        int n=Integer.parseInt(br.readLine());
        
        int f1=0,f2=1;
        System.out.println("fibonacci series:");
        System.out.println(f1+"\n"+f2);
        int f=f1+f2;
        System.out.println(f);
        
        int count=3;
        while(count<n)
        {
            f1=f2;
            f2=f;
            f=f1+f2;
            System.out.println(f);
            count++;
        }
    }
}
