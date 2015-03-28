import static org.junit.Assert.*;

import org.junit.Test;


public class KthFactorialTest {

    @Test
    public void testKthFac() {
        assertEquals(3628800, KthFactorial.kthFac(1, 10));
        assertEquals(3628800 / 10, KthFactorial.kthFac(1, 9));       
    }
}