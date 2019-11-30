//accept boolean value:

import java.io.*;

public class AcceptBoolean 
{
    public static void main(String args[]) throws IOException
    {
        boolean value;
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter a boolean value:");
        value=Boolean.parseBoolean(br.readLine());
        
        System.out.println("boolean value="+value);
    }
}
