//calculate power : x^y
import java.io.*;
import java.lang.Math;
public class calc_power 
{
    public static void main(String args[]) throws IOException
    {
        int x,y;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter base:");
        x=Integer.parseInt(br.readLine());
        System.out.println("enter power:");
        y=Integer.parseInt(br.readLine());
        System.out.println(Math.pow(x,y));      //Math.pow() method to find power of any number.
    }
}
