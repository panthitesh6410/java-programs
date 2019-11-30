//input using Scanner class:
import java.util.Scanner;
public class InputValues 
{
    public static void main(String args[])
    {
       Scanner key=new Scanner(System.in);      //making object of class Scanner.
        
       System.out.println("enter name,age,salary");
       String name=key.nextLine();
       int age=key.nextInt();
       float sal=key.nextFloat();
       
       System.out.println("name="+name);
       System.out.println("age="+age);
       System.out.println("salary="+sal);
    }
}
