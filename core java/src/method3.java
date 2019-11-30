//METHOD HAVING PARAMETERS AND RETURN-TYPE:
class summation3
{
    private int num1,num2;
    
    int sum(int num1,int num2)
    {
        return(num1+num2);
    }
}
public class method3 
{
    public static void main(String args[])
    {
        summation3 obj=new summation3();
        int result=obj.sum(2,6);
        System.out.println("result="+result);
    }
}
