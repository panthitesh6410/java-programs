//copying string into array:

import java.util.Scanner;
import java.io.*;
public class strcpy
{
    public static void main(String args[])
    {
        //InputStreamReader obj=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(obj);
        Scanner key=new Scanner(System.in);
        String str;
        System.out.println("enter any string:");
        str=key.nextLine();
        //str=br.readLine();
        char arr[]=new char[20];
        str.getChars(2,10,arr,0);    
        System.out.println(arr);
    }
}
