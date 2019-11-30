//fibonqcci series:
import java.util.Scanner;
public class fibonacci_series 
{
    public static void main(String args[])
    {
        Scanner key=new Scanner(System.in);
        System.out.println("enter number of terms:");
        int n=key.nextInt();
        int a=0,b=1,c;
        System.out.println("fibonacci sreies:");
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }
    }
}
