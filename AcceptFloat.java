//accepting float value:

import java.io.*;
public class AcceptFloat 
{
    public static void main(String args[]) throws IOException
    {
        float pi;
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter float value:");
        pi=Float.parseFloat(br.readLine());
        
        System.out.println("float value="+pi);
    }
}
