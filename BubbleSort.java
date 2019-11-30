import java.io.*;
public class BubbleSort
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        
        int n,temp;
        System.out.println("enter size:");
        n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int t=0;t<n;t++)
        {
            arr[t]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<=n-2;i++)
        {
            for(int j=0;j<=n-2-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        System.out.println("list after bubble sorting:");
        for(int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
}
