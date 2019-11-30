//interface:
	
interface drawable
{
	void draw();
}
//implementation by user:
class rectangle implements drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class circle implements drawable
{
	public void draw()
	{
		System.out.println("drawing circle");
	}
}
class interface22						//main class
{
	public static void main(String args[])
	{
		drawable obj1=new circle();
		drawable obj2=new rectangle();
		obj1.draw();
		obj2.draw();
	}
}
		