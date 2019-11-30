//passing arrays to method:

import java.io.*;
import java.util.*;

class add_matrix
{
    int arr[][];
    int r,c;
    add_matrix(int r,int c) throws IOException
    {
        this.r=r;
        this.c=c;
    }
    int[][] get_matrix() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0;i<r;i++)
        {
            String s=br.readLine();
            st=new StringTokenizer(s," ");
            
            for(int j=0;j<c;j++)
            {
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        return arr;
    }
    int[][] find_sum(int a[][],int b[][]) throws IOException
    {
        int temp[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                temp[i][j]=a[i][j]+b[i][j];
            }
        }
        return temp;
    }
    void display_matrix(int res[][]) throws IOException
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
public class matrix_sum 
{
    public static void main(String args[]) throws IOException
    {
        add_matrix obj1=new add_matrix(3,3);
        add_matrix obj2=new add_matrix(3,3);
        int x[][],y[][],z[][];
        System.out.println("enter elements for 1st matrx:");
        x=obj1.get_matrix();
        System.out.println("enter elements for 2nd matrix:");
        y=obj2.get_matrix();
        z=obj1.find_sum(x, y);
        System.out.println("sum of matrix is:");
        obj2.display_matrix(z);
    }
}
