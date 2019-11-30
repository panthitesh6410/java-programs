//use of some operators:

public class op
{
    public static void main(String [] args)
    {
            int num1=1;
            System.out.println(num1);
            System.out.println(num1++);     //post-increment operator
            System.out.println(num1);
            System.out.println(++num1);     //pre-increment operator
            
            
            int a=4;
            int b=6;
            int max=(a>b)?a:b;              //use of "conditional" operator(? :)
            System.out.println(max);
            
            op obj=new op();
            boolean x=obj instanceof op;        //use of "instanceof" operator
            System.out.println(x);
            
            double z=10.54;
            int y;
            y=(int)z;                           //use of "cast" operator
            System.out.println(y);
    }
    
}
