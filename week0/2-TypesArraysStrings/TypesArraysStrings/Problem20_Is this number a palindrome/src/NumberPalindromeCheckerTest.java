import static org.junit.Assert.*;

import org.junit.Test;

public class NumberPalindromeCheckerTest {

    @Test
    public void testIsPalindromeNumber(){
        assertEquals(true, NumberPalindromeChecker.isPalindrome(191));
        assertEquals(false, NumberPalindromeChecker.isPalindrome(1992));
        assertEquals(true, NumberPalindromeChecker.isPalindrome(0x00));
    }
}