public class continue_statement 
{
    public static void main(String args[])
    {
        int i=1,j;
        while(i<=3)
        {
            System.out.println(i);
            for(j=1;j<=5;j++)
            {
                if(j>3) continue;       //continue statement in nested loop
                System.out.println("\t"+j);
            }
            i++;
        }
    }
}
