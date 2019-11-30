//BITWISE OPERATORS:

public class bits 
{
    public static void main(String []args)
    {
        int x=10;
        int y=11;
        
        System.out.println("~x="+(~x));             //bitwise complement operator
        System.out.println("x&y="+(x&y));           //bitwise and operator
        System.out.println("x|y="+(x|y));           //bitwise or operator
        System.out.println("x^y="+(x^y));           //bitwise xor operator
        System.out.println("x<<2="+(x<<2));         //bitwise left shift operator
        System.out.println("x>>2="+(x>>2));         //bitwise right shift operator
        System.out.println("x>>>2="+(x>>>2));       //bitwise zero fill right shift operator
    }
    
}
