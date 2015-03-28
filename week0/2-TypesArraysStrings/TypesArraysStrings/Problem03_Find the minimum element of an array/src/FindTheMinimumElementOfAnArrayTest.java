import static org.junit.Assert.*;

import org.junit.Test;


public class FindTheMinimumElementOfAnArrayTest {

    @Test
    public void testMin() {
        int min = FindTheMinimumElementOfAnArray.min(new int[]{1, 3, 4, 5, 6, -1, 23, -125, 125125, -63262, 2151, -1212});
        assertTrue(min == -63262);

        min = FindTheMinimumElementOfAnArray.min(new int[]{-1, 0, 1, 1, -1, -9, 0, 5});
        assertTrue(min == -9);
    }
}