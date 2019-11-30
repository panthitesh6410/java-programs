//to compare two strings:

import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class strcompare 
{
    public static void main(String args[]) throws IOException
    {
        //Scanner key=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1,str2;
        System.out.println("enter string1:");
        str1=br.readLine();
        System.out.println("enter string2:");
        str2=br.readLine();
        
        if(str1.equals(str2))
            System.out.println("strings are equal");
        else
            System.out.println("strings are not equal");
    }
}
