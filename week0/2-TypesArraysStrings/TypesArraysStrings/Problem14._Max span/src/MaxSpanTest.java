import static org.junit.Assert.*;

import org.junit.Test;


public class MaxSpanTest {

    @Test
    public void testMaxSpan() {
        assertEquals(4, MaxSpan.maxSpan(new int[] { 1, 2, 1, 1, 3 }));
        assertEquals(6, MaxSpan.maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 }));
        assertEquals(6, MaxSpan.maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 }));
    }
}