//3D Array :
import java.lang.*;
public class Array3D 
{
    public static void main(String args[])
    {
        int arr[][][]={ { {10,20,30}, {40,50,60}},
                      {   {70,80,90}, {20,40,60}},
                      {   {10,30,50,},{90,70,20} } };
        
        for(int i=0;i<3;i++)       //tables
        {
            System.out.println("table:"+i);
            for(int j=0;j<2;j++)       //rows
            {
                //System.out.print("row:"+j);
                for(int k=0;k<3;k++)   //columns
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
