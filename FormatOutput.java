//use of format() method:
public class FormatOutput 
{
    public static void main(String args[])
    {
        String name="hitesh pant";
        int age=18;
        float perc=98.8f;
        
        String str=String.format(" name=%s %n age=%d %n percentage=%f",name,age,perc);         //format output and get into string
        System.out.println(str);
    }
}
