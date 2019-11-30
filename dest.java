//destructor:
	
class student
{
	String name;
	int roll;

	student()
	{
		name="null";
		roll=0;
	}
	
	student(String n,int r)
	{
		name=n;
		roll=r;
	}		

	void finalize()		// Destructor.
	{}
	
	public static void main(String arfs[])
	{
		student obj = new student("hitesh", 25);	
	}
}