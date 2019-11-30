import java.io.*;
import java.util.Scanner;
import calculator.opertion;
public class calc 
{
    public static void main(String args[]) throws IOException
    {
        //Scanner key=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 2 numbers to perform operations:");
        //Float a=key.nextFloat();
        Float a=Float.parseFloat(br.readLine());
        //Float b=key.nextFLoat();
        Float b=Float.parseFloat(br.readLine());
        
        opertion obj=new opertion();
        
        obj.addition(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
       
    }
}
