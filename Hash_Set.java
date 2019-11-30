import java.util.*;
class Hash_Set
{
	public static void main(String args[])
	{
		HashSet<String> hs = new HashSet<>();
		
		hs.add("hitesh");
		hs.add("hari");
		hs.add("giri");
		hs.add("buddhi");
		hs.add("anuj");
		
		System.out.println("Hash Set="+hs);
		
		Iterator it = hs.Iterator();	
		
		System.out.println("elements using Iterator:");
		
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}