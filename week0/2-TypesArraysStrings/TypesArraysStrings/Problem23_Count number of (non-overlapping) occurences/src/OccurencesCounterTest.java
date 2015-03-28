import static org.junit.Assert.*;

import org.junit.Test;


public class OccurencesCounterTest {

    @Test
    public void testNonOverlappingOccurrences(){
        assertEquals(0, OccurencesCounter.countOcurrences("demetrius", ""));
        assertEquals(2, OccurencesCounter.countOcurrences("ab", "abandon all hope, abandon this place!"));
        assertEquals(2, OccurencesCounter.countOcurrences("de", "deutschland uber alles, detonate all the allez"));
    }
}
