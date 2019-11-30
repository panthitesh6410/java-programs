//methods in classes:
import java.io.*;
import java.util.Scanner;
class person2
{
    private String name;
    private int age;
    
    public void get_data()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner key=new Scanner(System.in);
        System.out.println("enter name=");
        name=br.readLine();  //or name=key.nextLine();
        System.out.println("enter age=");
        age=Integer.parseInt(br.readLine());
    }
    public void put_data()
    {
        if(age<30)
            System.out.println(name+" is young");
        else if(age>=30 && age<50)
            System.out.println(name+" is middle aged");
        else
            System.out.println(name+" is old");
    }
}
public class MethodsInClasss
{
    public static void main(String args[]) throws IOException
    {
        person2 obj=new person2();
        obj.get_data();
        obj.put_data();
    }
}
