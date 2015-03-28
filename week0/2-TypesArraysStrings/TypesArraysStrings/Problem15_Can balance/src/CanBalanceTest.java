import static org.junit.Assert.*;

import org.junit.Test;


public class CanBalanceTest {

    @Test
    public void testCanBalance() {
        assertTrue(CanBalance.canBalance(new int[] { 1, 1, 1, 2, 1 }));
        assertFalse(CanBalance.canBalance(new int[] { 2, 1, 1, 2, 1 }));
        assertTrue(CanBalance.canBalance(new int[] { 10, 10 }));
    }
}