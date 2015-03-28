import static org.junit.Assert.*;

import org.junit.Test;


public class SmallestMultipleTest {

    @Test
    public void testGetSmallestMultiple() {
        assertEquals(2520, SmallestMultiple.getSmallestMultiple(10));
        assertEquals(232792560, SmallestMultiple.getSmallestMultiple(20));
    }
}