import static org.junit.Assert.*;

import org.junit.Test;

public class LargestIntegerPalindromeTest {

    @Test
    public void testGetLargestPalindrome() {
        assertEquals(99, LargestIntegerPalindrome.getLargestPalindrome(100));
        assertEquals(99_999, LargestIntegerPalindrome.getLargestPalindrome(10_0000));
        assertEquals(123_321, LargestIntegerPalindrome.getLargestPalindrome(123_456));
    }
}