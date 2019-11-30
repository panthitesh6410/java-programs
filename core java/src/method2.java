//METHOD HAVING NO PARAMETER,HAVING RETURN TYPE:

class summation2
{
    private int num1,num2;
    
    summation2(int a,int b)
    {
        num1=a;
        num2=b;
    }
    public int sum()
    {
        int result=num1+num2;
        return(result);
    }
}
public class method2 
{
    public static void main(String args[])
    {
        summation2 obj=new summation2(2,6);
        int res=obj.sum();
        System.out.println("result is="+res);
    }
}
