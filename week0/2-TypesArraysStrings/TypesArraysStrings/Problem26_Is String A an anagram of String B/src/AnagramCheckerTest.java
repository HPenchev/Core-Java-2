import static org.junit.Assert.*;

import org.junit.Test;


public class AnagramCheckerTest {

    @Test
    public void testAnagrams(){
        assertEquals(true, AnagramChecker.areAnagrams("A", "A"));
        assertEquals(true, AnagramChecker.areAnagrams("BRADE", "BEARD"));
        assertEquals(true, AnagramChecker.areAnagrams("TOP CODER", "COTE PROD"));
        assertEquals(false, AnagramChecker.areAnagrams("TOP CODER", "COTO PRODE"));    
    }
}