class parent
{
	void parent_fun()
	{
		System.out.println("this is parent class function");
	} 
}
class child1 extends parent
{
	void child1_fun()
	{
		System.out.println("this is child1 class function");
	}
}
class child2 extends parent
{
	void child2_fun()
	{
		System.out.println("this is child2 class function");
	}
}
class hierarchical_inheritance
{
	public static void main(String aefds[])
	{
		child1 obj1=new child1();
		child2 obj2=new child2();

		obj1.child1_fun();
		obj1.parent_fun();
		obj2.child2_fun();
		obj2.parent_fun();
	}
}