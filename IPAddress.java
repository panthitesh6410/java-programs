import java.io.*;
import java.net.*;
public class IPAddress {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the name of websit : ;");
        String site=br.readLine();
        
        try{
            InetAddress ip= InetAddress.getByName(site);
            System.out.println("the IP Address id : "+ip);
        }
        catch(UnknownHostException ue)
        {
            System.out.println("website not found");
        }
    }
}
