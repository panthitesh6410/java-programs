//illustration  of this keyword:

class UseOfThis
{
    private int x;          //instatnce variable
    
    UseOfThis()             //default constructor
    {
        this(400);      //call present class parameterised constructor and send 400
        this.access();  //call present class method
    }
    UseOfThis(int x)        //parameterized constructor
    {
        this.x=x;
    }
    void access()
    {
        System.out.println("x="+x);
    }
}
public class this_keyword 
{
    public static void main(String argd[])
    {
        UseOfThis obj=new UseOfThis();
        obj.access();
    }
}
