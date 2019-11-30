import java.io.*;
import java.net.*;
class client2
{
	public static void main(String args[]) throws Exception
	{
		//create client socket:
		Socket s = new Socket("localhost",888);
		
		//to send data to server :
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		//to read data comming from server :
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		//to read data from keyboard :
		BufferedReader kb =new BufferedReader(new InputStreamReader(System.in));
	
		String str,str1;
		//repeat as long as exit is not typed at client's end :
		while(!(str=kb.readLine()).equals("exit"))
		{
			dos.writeBytes(str+"\n");	//send to server.
			str1=br.readLine();		//recieve from server.
			System.out.println(str1);
		}
		//close connections:
		dos.close();
		br.close();
		kb.close();
		s.close();	
	}
}