import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeLengthAroundAsteriskCheckerTest {

    @Test
    public void testPalindromStarLength(){
        assertEquals(2, PalindromeLengthAroundAsteriskChecker.getPalindromeLength("taz*zad"));
        assertEquals(0, PalindromeLengthAroundAsteriskChecker.getPalindromeLength("tad*zad"));
        assertEquals(3, PalindromeLengthAroundAsteriskChecker.getPalindromeLength("tad*dat"));
    }
}