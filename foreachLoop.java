//working of for-each Loop:
public class foreachLoop 
{
    public static void main(String args[])
    {
        int sum=0;
        int arr[]={1,100,200,-300,0};
        for(int i:arr)                       //syntax of for-each loop
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum is:"+sum);
    }
}
