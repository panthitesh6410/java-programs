//return statement is used to reurn a cretain value from a method
 
public class returnStatement
{
    public static void main(String args[])
    {
        int result=function(10);        //result function store value returned by function()
        System.out.println(result);
    }
    static int function(int num)
    {
        return num*num;             //return statement 
    }
}
