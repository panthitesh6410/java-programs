//interface:
	
interface bank
{
	float interestrate();
}
class SBI implements bank
{
	public float interestrate()
	{
		return(9.15f);
	}
}
class PNB implements bank
{
	public float interestrate()
	{
		return(4.2f);
	}
}
class interface33
{
	public static void main(String args[])
	{
		bank obj1=new SBI();
		System.out.println("interest rate at SBI= "+obj1.interestrate());
		bank obj2=new PNB();
		System.out.println("interest rate at PNB= "+obj2.interestrate());
	}
}