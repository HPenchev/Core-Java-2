import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class FindTheKthMinimalElementOfAnArrayTest {

    @Test
    public void testKthMin() {
        int testArr[] = new int[] { 1, 2151, 125, 125, 1125, 16, 754, 132, 613, -51521, 51251, 675, 125366 };
        Arrays.sort(testArr);

        assertTrue(testArr[0] == FindTheKthMinimalElementOfAnArray.kthMin(1, testArr));
        assertTrue(testArr[1] == FindTheKthMinimalElementOfAnArray.kthMin(2, testArr));
        assertTrue(testArr[2] == FindTheKthMinimalElementOfAnArray.kthMin(3, testArr));
    }
}