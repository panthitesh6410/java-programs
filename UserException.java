class UserException extends Exception
{
	static double acno[]={10, 20, 30};
	static double balance[]={1000.34, 4567.23, 98.71};	

	UserException()
	{}
		
	UserException(String str)
	{
		super(str);		
	}	
	
	public static void main(String args[])
	{
		try
		{
			System.out.println("ACNO"+"\t"+"BALANCE");
			for(int i=0;i<=2;i++)
			{
				System.out.println(acno[i]+"\t"+balance[i]);	
				if(balance[i]<1000)
				{
					UserException ue = new UserException("amount is less than 1000");
					throw ue;
				}
			}	
		}
		
		catch(UserException ue)
		{
			ue.printStackTrace();		// ue.printStackTrace();
		}
	}
}