//runtime polymorphism or dynamic memory dispatch:

class parent
{
	void function()
	{
		System.out.println("parent class function");
	}	
}
class child extends parent
{
	void function()
	{
		System.out.println("child class function");
	}
}
class overriding
{
	public static void main(String ars[])
	{
		parent obj1=new parent();
		obj1.function();		//calling parent class function
	
		parent obj2=new child();		
		obj2.function();			//calling child class function
	}
}
