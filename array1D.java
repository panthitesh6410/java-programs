//program to accpet 5 integer values in a 1-D array  and print total of it:
import java.io.*;
public class array1D 
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        int n;
        System.out.println("enter size:");
        n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];           // creating 1-D array of size n
        System.out.println("enter marks:");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("marks are:"+arr[i]);
        }
        int total=0;
        for(int  i=0;i<n;i++)
        {
            total+=arr[i];
        }
        System.out.println("total is="+total);
        float perc;
        perc=(float)total/n;
        System.out.println("percentage="+perc);
    }
}
