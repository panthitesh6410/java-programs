//parameterised constructor:
class person1
{
    private String name;
    private int age;
    
    person1()   //default constructor
    {
        name="hitesh";
        age=18;
    }
    person1(String s,int a)     //PARAMETERIZED CONSTRUCTOR
    {
        name=s;
        age=a;
    }
    void talk()
    {
        System.out.println("my name is "+name);
        System.out.println("my age is "+age);
    }
}
public class parameterized_constructor 
{
    public static void main(String argsp[])
    {
        person1 hitesh=new person1();
        hitesh.talk();
        person1 giri=new person1("giri",20);
        giri.talk();
    }
}
