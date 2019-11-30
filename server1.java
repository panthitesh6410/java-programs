import java.io.*;
import java.net.*;
class server1
{
	public static void main(String args[]) throws IOException
	{
		//create a server socket:
		ServerSocket ss=new ServerSocket(777);
		
		Socket s=ss.accept();
		System.out.println("Connection Established");
		
		OutputStream obj=s.getOutputStream();

		// to send data to socket:
		PrintStream ps=new PrintStream(obj);
	
		//sending strings to clients :
		String str="hello,its me...";
		ps.println(str);
		
		//closing connections by stream and socket:
		ps.close();
		s.close();
	}
}
