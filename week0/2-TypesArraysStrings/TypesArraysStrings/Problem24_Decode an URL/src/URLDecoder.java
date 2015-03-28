import java.io.UnsupportedEncodingException;

public class URLDecoder {    
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(decodeURL("kitten%20pic.jpg"));
        System.out.println(decodeURL("%20"));
        System.out.println(decodeURL("%3A"));
        System.out.println(decodeURL("%3D"));
        System.out.println(decodeURL("%2F"));
    }

    public static String decodeURL(String input) throws UnsupportedEncodingException{
        return java.net.URLDecoder.decode( input, "UTF-8" );
    }
}