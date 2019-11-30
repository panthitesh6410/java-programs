// function with no arguements and returning nothing:
class function1
{
	int length=10;
	int breadth=20;
		
	public void rect_area()                  					//function with no arguements and returning nothing	
	{
		System.out.println("area of rectangle="+(length*breadth));		
	}
	public static void main(String args[])
	{
		function1 obj=new function1();	
		obj.rect_area();			
	}
}	
		
