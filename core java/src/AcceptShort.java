//accepting Short value:
import java.io.*;
public class AcceptShort
{
    public static void main(String args[]) throws IOException
    {
        short age;
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter short value:");
        age=Short.parseShort(br.readLine());
        
        System.out.println("short value="+age);
    }
}
