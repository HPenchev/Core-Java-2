import static org.junit.Assert.*;

import org.junit.Test;

public class MaximalScalarProductTest {

    @Test
    public void testMaximalScalarSum() {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] b = new int[] { 0, 0, 0, 0, 0, 0 };

        assertEquals(0, MaximalScalarProduct.maximalScalarSum(a, b));
        b = new int[] { 1, 1, 1, 1, 1, 1 };

        assertEquals(21, MaximalScalarProduct.maximalScalarSum(a, b));

        b = new int[] { 5, 4, 8, 9, -1, 2 };
        assertEquals(129, MaximalScalarProduct.maximalScalarSum(a, b));
    }
}