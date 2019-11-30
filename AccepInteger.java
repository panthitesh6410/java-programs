//accepting integer value:

import java.io.*;

public class AccepInteger 
{
    public static void main(String args[]) throws IOException
    {
        
        int num;
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter an integer value:");
        num=Integer.parseInt(br.readLine());
                
        System.out.println("integer="+num);
        
    }
}
