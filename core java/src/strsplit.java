//to split a string ;

import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class strsplit 
{
    public static void main(String args[]) throws IOException
    {
        Scanner key=new Scanner(System.in);
        //InputStreamReader obj=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(obj);
        System.out.println("enter a string:");
        String str1=key.nextLine();
        //str=readLine();
        String str2[];
        str2=str1.split(" ");
        for(int i=0;i<str2.length;i++)
        {
            System.out.println(str2[i]);
        }
    }
}
