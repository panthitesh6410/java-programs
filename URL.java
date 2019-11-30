import java.net.*;
public class URL 
{
    public static void main(String args[])
    {
        URL obj=new URL("http://dreamtechpress.com/index.html");
        System.out.println("protocol : "+obj.getProtocol());
        System.out.println("Host : "+obj.getHost());
        System.out.println("File : "+obj.getFile());
        System.out.println("Port : "+obj.getPort());
        System.out.println("Path : "+obj.getPath());
    }

    private URL(String httpdreamtechpresscomindexhtml) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String getProtocol() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String getHost() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String getFile() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String getPort() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String getPath() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
