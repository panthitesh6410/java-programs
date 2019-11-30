//accepting loong value:
import java.io.*;
public class AcceptLong 
{

    public static void main(String args[]) throws IOException
    {
        long measure;
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter long value:");
        measure=Long.parseLong(br.readLine());
        
        System.out.println("long value:"+measure);
    }
}
