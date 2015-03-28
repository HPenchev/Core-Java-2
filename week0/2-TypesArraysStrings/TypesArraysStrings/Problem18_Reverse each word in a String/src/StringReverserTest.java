import static org.junit.Assert.*;

import org.junit.Test;


public class StringReverserTest {

    @Test
    public void testReverseWords(){
        assertEquals("tahW si siht", StringReverser.reverseEveryWord("What is this"));
        assertEquals("yrevE drow si desrever", StringReverser.reverseEveryWord("Every word is reversed"));
    }
}
