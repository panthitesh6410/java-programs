//calling main() method of class1 from class2:

class class1 
{
    public static void main(String args[])
    {
        for(String s:args)
            System.out.println(s);
    }
}
class class2 
{
    public static void main(String args[])
    {
        String names[]={"hitesh","hari","giri"};
        class1.main(names);
    }
}
