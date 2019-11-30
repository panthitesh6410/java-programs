//illustration of static method:
class Static
{
    static double sum(double num1,double num2)  //declaring static method.
    {
        double result=num1+num2;
        return result;
    }
}
public class static_method 
{
    public static void main(String args[])
    {
        double ans=Static.sum(20,45);    //calling static method using className.
        System.out.println("sum="+ans);
    }
}
