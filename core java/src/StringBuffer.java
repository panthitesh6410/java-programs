//implementation of different methods of buffer string class:
import java.lang.String;
import java.io.*;
public class StringBuffer 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb=new StringBuffer();     //creating string buffer object
        
        System.out.println("enter surname:");
        String sur=br.readLine();
        System.out.println("enter middle nanme:");
        String mid=br.readLine();
        System.out.println("enter last name:");
        String last=br.readLine();
        //append or add sur to sb:
        sb.append(sur);
        //append last to sb:
        sb.append(last);
        System.out.println("NAME="+sb);
        //insert mid after sur name in sb:
        int n=sur.length();
        sb.insert(n,mid);
        System.out.println("FULL NAME="+sb);
        //reverse th name:
        System.out.println("revered name="+sb.reverse());
    }
}
