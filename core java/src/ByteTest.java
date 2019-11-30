public class ByteTest 
{
    public static void main(String args[])
    {
        Byte obj1=new Byte("120");
        Byte obj2=new Byte("60");
        
        int x= obj1.compareTo(obj2);
        
        if(x==0)
            System.out.println("both values are same");
        else if(x>0)
            System.out.println("obj1 is greater than obj2");
        else
            System.out.println("obj2 is greater than obj1");
        
        
    }
    
}
