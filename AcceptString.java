//acceepting string :

import java.io.*;

public class AcceptString 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter a string:");
        String str=br.readLine();
        
        System.out.println("string is:"+str);
    }
}
