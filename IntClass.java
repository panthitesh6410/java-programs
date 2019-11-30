import java.io.*;
public class IntClass 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter an integer:");
        String str=br.readLine();
        
        //converting string into integer 
        int i=Integer.parseInt(str);
        System.out.println("in decimal="+i);
        
        //convert int into binary:
        str=Integer.toBinaryString(i);
        System.out.println("in binary="+str);
    }
}
