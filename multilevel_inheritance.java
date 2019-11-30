class college
{
	String college_name;


	void get_college(String college_name)
	{
		this.college_name=college_name;

	}
	void put_college()
	{
		System.out.println("college name="+college_name);

	}
}

class department extends college
{
	String dept_name;
	
	void get_dept(String dept_name)
	{
		this.dept_name=dept_name;
	}
	void put_dept()
	{
		System.out.println("dept name="+dept_name);
	}
}

class student extends department
{
	String sname;
	int roll;

	student(String college_name,String dept_name,String sname,int roll)
	{
		get_college(college_name);
		get_dept(dept_name);		
		this.sname=sname;
		this.roll=roll;
	}
	void put_student()
	{
		put_college();
		put_dept();
		System.out.println("student name="+sname);
		System.out.println("roll.no.="+roll);
	}
}

class multilevel_inheritance
{
	public static void main(String args[])
	{
		student s = new student("HCET","CSE","hitesh pant",25);
		s.put_student();			
	}
}