import java.util.Scanner;
public class sampleclass
{
    public static void main(String args[])
    {
        Scanner key=new Scanner(System.in);
        int n;
        n=key.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=key.nextInt();
            }
         
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println("\t");
        }
    }
}
