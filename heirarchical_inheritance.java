class shape
{
	int area;

	void show_area()
	{
		System.out.println("area="+area);	
	}
}
class rectangle extends shape
{
	int length,breadth;
	
	rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;	
	} 	
	area = length * breadth;
}
class circle extends shape
{ 
	int radius;	

	circle(int radius)
	{
		this.radius=radius;
	} 
	area=3.14*radius*radius;
}
class heirarchical_inheritance
{
	public static void main(String argsfdsfdsf[])
	{
		rectangle r = new rectangle();
		circle c = new circle();
	
		r.show_area();
		c.show_area();
	}
}