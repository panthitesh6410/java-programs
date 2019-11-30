class shape 
{	
	int length=12;
	int breadth=2;
	
	shape()
	{
		length=breadth=0;
	}
}	
class SingleInheritance extends shape
{
	void calc_area()
	{
		System.out.println(length*breadth); 	
	}	
	public static void main(String aefs[])
	{
		SingleInheritance obj=new SingleInheritance();
		obj.calc_area();			
	}
}