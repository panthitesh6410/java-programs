public class breakStatement 
{
    public static void main(String args[])
    {
        int i=1;
        for( ; ; )              //infinite loop
        {
            System.out.println(i++);
        if(i>10)                    //breaking condition
            break;      
        }            
    }
    
}
