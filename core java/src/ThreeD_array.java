//program to take input from user and show the 3D-Array:
import java.io.*;
//import java.util.Scanner;
public class ThreeD_array
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader obj=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(obj);
        //Scanner key=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the size of 3D array:");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        int arr[][][]=new int[a][b][c];
        System.out.println("enter array elements:");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                for(int k=0;k<c;k++)
                {
                    arr[i][j][k]=Integer.parseInt(br.readLine());
                }
            }
        }
        System.out.println("3D array is:\n");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                for(int k=0;k<c;k++)
                {
                   System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
