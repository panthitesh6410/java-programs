//import java.lang.*;
public class string
{
    public static void main(String args[])
    {
        //three ways to create a string:
        String str1="hitesh pant";          //1st method
        String str2=new String("HELLO WORLD");  //2nd method
        char arr[]={'w','e','l','c','o','m','e'};   //3rd method
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(arr);
        
        //to find length of the string:
        System.out.println("length of str1="+str1.length());
        System.out.println("length of str2="+str2.length());
        
        //to concatenate two strings:
        System.out.println("str1+str2="+str1.concat(str2));
        //concatenate three strings:
        System.out.println("str1+str2+str3="+str1+str2+arr);
        
        //test if str1 starts with A:
        boolean x=str1.startsWith("A");
        if(x)   System.out.println("str1 starts with A");
        else    System.out.println("str1 does not starts with A");
        
        //extract sub-string from str2,starting from 0th char to 6th char:
        String p=str2.substring(0,7); 
        System.out.println(p);
        
        //convert str1 into uppercase and lowercase:
        System.out.println("upper-case of str1="+str1.toUpperCase());
        System.out.println("lower case of str2="+str2.toLowerCase());
    }
}