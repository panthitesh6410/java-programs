// function with no arguements and returning nothing:
class f1
{
	int length=10;
	int breadth=20;
		
	public void rect_area()                  					//function with no arguements and returning nothing	
	{
		System.out.println("area of rectangle="+(length*breadth));		
	}
	public static void main(String args[])
	{
		f1 obj=new f1();
		obj.rect_area();			
	}
}	
		