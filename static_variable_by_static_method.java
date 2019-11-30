//accessing static variable using static method:
class static_class
{
    static int x=100;       //static variable.
    
    static void access()
    {
        System.out.println("static variable x="+x);
    }
}
public class static_variable_by_static_method 
{
    public static void main(String args[])
    {
        static_class.access();
    }
}
