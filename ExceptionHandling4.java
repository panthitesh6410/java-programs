class ExceptionHandling4
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("in.txt");
			FileOutputStream fout=new FileOoutputStream("out.txt");
		}
		finally
		{
			fin.close();
			fout.close();
		}
	}
}