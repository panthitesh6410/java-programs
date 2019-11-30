//METHOD HAVING NO PARAMETERS AND RETURNING NOTHING:
class summation1
{
    private int num1,num2;
    
    summation1(int a,int b)
    {
        num1=a;
        num2=b;
    }
    
    public void sum()
    {
        int result=num1+num2;
        System.out.println("result="+result);
    }
}
public class method1
{
    public static void main(String args[])
    {
        summation1 obj=new summation1(20,30);
        obj.sum();
    }
}
