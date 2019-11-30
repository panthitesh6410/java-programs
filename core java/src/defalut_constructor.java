//default constructor:
class persons
{
    private String name;
    private int age;
    persons()               //DEFAULT CONSTRUCTOR
    {
        name="hitesh";
        age=18;
    }
    void talk()
    {
        System.out.println("my name is "+name);
        System.out.println("my age is "+age);
    }
}
public class defalut_constructor
{
    public static void main(String args[])
    {
        persons hitesh=new persons();
        hitesh.talk();
        persons giri=new persons();
        giri.talk();
    }
}
