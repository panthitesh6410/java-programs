//accepting a character:
import java.io.*;
public class AcceptChar 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        System.out.println("enter a character:");
        char ch=(char)br.read();
        
        System.out.println("character:"+ch);
    }
    
}
