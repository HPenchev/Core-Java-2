import static org.junit.Assert.*;

import org.junit.Test;

public class IsItAnOddNumberTest {
  
    @Test
    public void testIsOdd() {
        assertTrue(IsItAnOddNumber.isOdd(3));
        assertTrue(IsItAnOddNumber.isOdd(5));
        assertTrue(IsItAnOddNumber.isOdd(7));
        assertTrue(IsItAnOddNumber.isOdd(-1));
        assertTrue(IsItAnOddNumber.isOdd(-3));
        assertTrue(!IsItAnOddNumber.isOdd(0));
    }
}