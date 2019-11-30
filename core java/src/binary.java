public class binary
{
    public static void main(String args[])
    {   
        int num=0b10110;          //binary
        
        System.out.printf("\n in decimal=%d",num);          //in decimal
        System.out.printf("\n in hexadecimal=%x",num);      //in hexadecimal
        System.out.printf("\n in octal=%o",num);            //in octal
        System.out.printf("\n in binary=%s",Integer.toBinaryString(num));       //in binary
             
    }
    
}
