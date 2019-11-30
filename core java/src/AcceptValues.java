//accepting and displaying values of different datatypes:
import java.io.*;
public class AcceptValues 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        String name;
        int roll;
        float perc;
        char gender;
        
        System.out.println("enter name:");           
        name=br.readLine();                             //accept string
        System.out.println("enter roll.no:");
        roll=Integer.parseInt(br.readLine());           //accept integer
        System.out.println("enter percentage:");
        perc=Float.parseFloat(br.readLine());           //accept float
        System.out.println("enter gender:");
        gender=(char)br.read();                         //accept character
        
        System.out.println("name="+name);
        System.out.println("roll.no="+roll);
        System.out.println("percentage:"+perc);
        System.out.println("gender="+gender);
    }
    
}
