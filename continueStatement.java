public class continueStatement 
{
    public static void main(String args[])
    {
        int i;
        for(i=1;i<=10;i++)
        {
            if(i>5)
                continue;               //contine statement use to skip the conditions and continue loop after that
            System.out.print(i+"\t");
        }
    }
}
