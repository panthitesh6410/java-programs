//display a 2D-array or a matrix:
public class matrix 
{
    public static void main(String args[])
    {
        int matrix[][]={{12,1,2,400,6,72},{-100,-200,-34,-68,-128}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
