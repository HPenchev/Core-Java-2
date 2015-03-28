import static org.junit.Assert.*;

import org.junit.Test;


public class NumberOddTimeOccurenceTest {

    @Test
    public void testGetOddOccurrence() {
        int[] numbers = new int[] { 1, 1, 3, 3, 6, 5, 4, 6, 5, 9, 1, 1, 3, 15, 4, 5, 9, 3, 15 };
        assertEquals(5, NumberOddTimeOccurence.getOddOccurrence(numbers));
    }
}