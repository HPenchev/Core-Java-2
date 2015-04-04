import static org.junit.Assert.*;

import org.junit.Test;


public class BracketsCheckerTest {

    @Test
    public void test() {
        assertTrue(BracketsChecker.checkBrackets("((3 + 5) * 3 - )"));
    }

}
