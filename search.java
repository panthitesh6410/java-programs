//searching of string:linear search:

import java.io.*;
public class search 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        System.out.println("how many strings:");
        int n=Integer.parseInt(br.readLine());
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("enter string:");
            str[i]=br.readLine();
        }
        System.out.println("enter string to search:");
        String search=br.readLine();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(search.equalsIgnoreCase(str[i]))
            {
                System.out.println("fount at "+i+1+"th position");
                found=true;
            }
        }
        if(!found)
            System.out.println("not found");
    }
}
