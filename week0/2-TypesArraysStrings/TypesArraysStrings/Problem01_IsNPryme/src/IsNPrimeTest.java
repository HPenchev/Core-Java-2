import static org.junit.Assert.*;

import org.junit.Test;


public class IsNPrimeTest {

    @Test
    public void testIsPrime() {
        assertTrue(IsNPrime.isPrime(5));
        assertTrue(IsNPrime.isPrime(7));
        assertTrue(IsNPrime.isPrime(41));
        assertTrue(IsNPrime.isPrime(3));
        assertTrue(!IsNPrime.isPrime(39));
    }
}