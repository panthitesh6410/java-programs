public class breakInSwitch
{
   //use of break statement :break statement break the loop/switch and contol comes out.
    
    
    public static void main(String args[])
    {
        char ch='h';
        switch(ch)
        {
            case 'a':   System.out.println(ch+" is a vowel");
                        break;            
            case 'e':   System.out.println(ch+" is a vowel");
                        break;
            case 'i':   System.out.println(ch+" is a vowel");
                        break;
            case 'u':   System.out.println(ch+" is a vowel");
                        break;
            case 'o':   System.out.println(ch+" is a vowel");
                        break;
            default:    System.out.println(ch+" is a consonant");
                        break;
                
        }
    }
}
