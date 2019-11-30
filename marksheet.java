import java.util.Scanner;

class marksheet
{
	public static void main(String args[])
	{
		Scanner key=new Scanner(System.in);
		String name,division;
		int roll,h,e,sc,m,total,perc;
		System.out.println("\t\t\t STUDENT  DETAILS");
		System.out.println("*************************************************");
		System.out.println("enter student name:");
		name=key.nextLine();
		System.out.println("enter sudent roll.no:");
		roll=key.nextInt();
		System.out.println("enter hindi marks:");
		h=key.nextInt();
		System.out.println("enter english marks:");
		e=key.nextInt();
		System.out.println("enter science marks:");
		sc=key.nextInt();
		System.out.println("enter maths marks:");
		m=key.nextInt();
		System.out.println("\t\t\t UNIVERSITY OF MADHYA PRADESH");
		System.out.println("********************************************************************************");
		System.out.println("NAME:"+name+"\t\t\t ROLL NUMBER:"+roll);
		System.out.println(" ");
		System.out.println("SUBJECT NAME \t\t MAX \t\t MIN \t\t OBT");
		System.out.println(".....................................................................................");
		System.out.println("HINDI \t\t\t100 \t\t33 \t\t"+h);
		System.out.println("ENGLISH \t\t100 \t\t33 \t\t"+e);
		System.out.println("SCIENCE \t\t100 \t\t33 \t\t"+sc);
		System.out.println("MATHS \t\t\t100 \t\t33 \t\t"+m);
		System.out.println("........................................................................................");
		total=(h+e+sc+m);
		perc=total/4;
		System.out.println("TOTAL \t\t\t\t\t\t\t"+total);
		System.out.println("...........................................................................................");
		System.out.println("PERCENTAGE \t\t\t\t\t\t"+perc);
		
		if(perc>=50)
		{
			System.out.println("RESULT \t\t\t\t\t\t pass");
		}
		
		else
		{
			System.out.println("RESULT \t\t\t\t\t\t fail");
		}
		
	}
}		