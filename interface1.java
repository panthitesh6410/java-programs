//interface:

interface shape
{
	public void show();
}
class circle implements shape
{
	int radius;
	circle(int r)
	{
		radius=r;
	}
	public void show()
	{
		System.out.println("area of circle="+(3.14*radius*radius));
	}
}
class rectangle implements shape
{
	int length,breadth;
	rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void show()
	{
		System.out.println("area of rectangle="+(length*breadth));
	}
} 
class interface1
{
	public static void main(String aers[])
	{
		circle c=new circle(2);	
		rectangle r=new rectangle(3,4);
		
		c.show();
		r.show();
	}
}