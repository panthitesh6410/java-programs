class person
{
    String name;
    int age;
    void talk()
    {
        System.out.println("my name is "+name);
        System.out.println("my age is "+age);
    }
}
public class person_class
{    
    public static void main(String a[])
    {
        person hitesh=new person();
        //System.out.println("hash code="+hitesh.hashCode());
        hitesh.name="hitesh";
        hitesh.age=18;
        hitesh.talk();
    }
}
