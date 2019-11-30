import java.io.*;
//import java.lang.*;
public class charTest {
    public static void main(String args[]) throws IOException
    {
        char ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            System.out.println("enter any character");
            ch=(char)br.read();
            
            System.out.println("you entered:");
            
            if(Character.isDigit(ch))
                System.out.println("a digit");
            
            else if(Character.isUpperCase(ch))
                System.out.println("an uppercasse letter");
            
            else if(Character.isLowerCase(ch))
                System.out.println("an lowercasse letter");
            
            else
                System.out.println("invalid");
        }
        
    }
}
