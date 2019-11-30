import java.io.*;
import java.net.*;
class client1
{
	public static void main(String args[]) throws Exception
	{
		
		//create client socket at same port number i.e. 777 :
		Socket s=new Socket("localhost",777);
	
		//to read data comming from server :
		InputStream obj=s.getInputStream();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(obj));
		
		//recieve string :
		String str;
		while((str=br.readLine())!=null)
			System.out.println("from server: "+str);
	
		//closing connections :
		br.close();
		s.close();
	}
}

		
		