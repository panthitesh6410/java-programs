public class nestedLoops
{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            System.out.println("statement 1");      //this atatement runs 3 times.
            for(j=1;j<=4;j++)
            {
                System.out.println("statement 2");     //this statement runs 12(4X3) times.
            }
        }
    }
}
