import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseAStringTest {

    @Test
    public void testStringReverse(){
        assertEquals("ytrewq", ReverseAString.reverseMe("qwerty"));
        assertEquals("How about", ReverseAString.reverseMe("tuoba woH"));
        assertEquals("   ", "   ");
        assertEquals("This is bad", ReverseAString.reverseMe(ReverseAString.reverseMe("This is bad")));
    }
}