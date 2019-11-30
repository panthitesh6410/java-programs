//program to accept two numbers and perform addition,subtraction.multiplication.division:
import java.util.*;
import java.io.*;
public class arithmetic 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        float num1,num2,add,sub,mul,div;
        
        System.out.println("enter 2 numbers:");
        
        num1=Float.parseFloat(br.readLine());
        num2=Float.parseFloat(br.readLine());
        
        add=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        
        System.out.println("Addition="+add);
        System.out.println("Subtraction="+sub);
        System.out.println("Multiplication="+mul);
        System.out.println("Division="+div);
        
    }
}
