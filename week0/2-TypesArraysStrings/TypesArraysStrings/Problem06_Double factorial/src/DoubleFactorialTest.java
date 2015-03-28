import static org.junit.Assert.*;

import org.junit.Test;


public class DoubleFactorialTest {

    @Test
    public void testDoubleFac() {
        assertEquals(720, DoubleFactorial.doubleFac(3));
        assertEquals(2, DoubleFactorial.doubleFac(2));
    }
}