//accepting double value:

import java.io.*;
public class AcceptDouble
{
    public static void main(String []args) throws IOException
    {
        double dist;
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter double value:");
        dist=Double.parseDouble(br.readLine());
        
        System.out.println("Double valu="+dist);
    }
}
