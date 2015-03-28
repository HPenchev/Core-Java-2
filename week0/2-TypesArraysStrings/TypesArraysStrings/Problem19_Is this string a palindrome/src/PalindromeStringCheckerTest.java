import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeStringCheckerTest {

    @Test 
    public void testIsPalindrome(){
        assertEquals(true, PalindromeStringChecker.isPalindrome("radar"));
        assertEquals(false, PalindromeStringChecker.isPalindrome("Nixin"));
        assertEquals(false, PalindromeStringChecker.isPalindrome("Nikon"));
        assertEquals(true, PalindromeStringChecker.isPalindrome("Nobody ydoboN"));
        assertEquals(false, PalindromeStringChecker.isPalindrome("Nobody ydobom"));
    }
}