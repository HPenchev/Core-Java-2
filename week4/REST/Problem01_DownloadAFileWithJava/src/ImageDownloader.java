import java.net.*;
import java.io.*;


public class ImageDownloader {
    public static void main(String[] args) throws Exception {

        URL picture = new URL("http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg");
        InputStream in = picture.openStream();
        FileOutputStream out = new FileOutputStream("picture.jpg");
        
        byte[] b = new byte[4096];
        int n;
        while((n = in.read(b)) != -1) {
            out.write(b, 0, n);
        }
        
        in.close();
        out.close();
    }
}