//program to check whether a given year is a leap year or not:

import java.io.*;
public class LearYear 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter any year:");
        int year=Integer.parseInt(br.readLine());
        
        if(year%100==0 && year%400==0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}
