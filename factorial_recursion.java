//calculate factorial using recursion:
import java.io.*;
public class factorial_recursion 
{
    public static int calc_fact(int num)
    {
        if(num==0 || num==1)
            return 1;
        else
            return(num*calc_fact(num-1));
    }
    public static void main(String argsdfd[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter number for factorial:");
        int n=Integer.parseInt(br.readLine());
        System.out.println("factorial of "+n+" is "+factorial_recursion.calc_fact(n));
    }
}
