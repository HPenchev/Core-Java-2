import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToAPowerOfAnotherTest {

    @Test
    public void testPow() {
        assertEquals(8, IntegerToAPowerOfAnother.pow(2, 3));
        assertEquals(-1, IntegerToAPowerOfAnother.pow(-1, 9));
        assertEquals(1, IntegerToAPowerOfAnother.pow(99, 0));

        assertEquals(-32, IntegerToAPowerOfAnother.pow(-2, 5));
        assertEquals(729, IntegerToAPowerOfAnother.pow(3, 6));
    }
}