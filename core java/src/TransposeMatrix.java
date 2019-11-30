import java.util.Scanner;
public class TransposeMatrix 
{
    public static void main(String args[])
    {
        Scanner key=new Scanner(System.in);
        int r,c;
        System.out.println("enter size of row and column:");
        r=key.nextInt();
        c=key.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("enter elements in matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=key.nextInt();
            }
        }
        System.out.println("transpose of the matrix will be:");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }
        
    }
            
}
