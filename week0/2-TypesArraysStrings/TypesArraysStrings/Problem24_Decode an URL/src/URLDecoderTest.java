import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;


public class URLDecoderTest {

    @Test
    public void testDecodeUrl() throws UnsupportedEncodingException{
        assertEquals("http://meyerweb.com/eric/tools/dencoder/", URLDecoder.decodeURL("http%3A%2F%2Fmeyerweb.com%2Feric%2Ftools%2Fdencoder%2F"));
        assertEquals("http://javarevisited.blogspot.com/2012/10/10-java-string-interview-question-answers-top.html", URLDecoder.decodeURL("http%3A%2F%2Fjavarevisited.blogspot.com%2F2012%2F10%2F10-java-string-interview-question-answers-top.html"));
    }
}