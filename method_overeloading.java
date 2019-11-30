//method overloading :
//changing number of arguements:

class addition
{
	int sum(int a,int b)
	{
		return(a+b);	
	}
	int sum(int a,int b,int c)
	{
		return(a+b+c);
	}
}
class method_overloading
{
	public static void main(String args[])
	{
		addition obj=new addition();
		System.out.println(obj.sum(2,5));
		System.out.println(obj.sum(10,20,30));				
	}
}	