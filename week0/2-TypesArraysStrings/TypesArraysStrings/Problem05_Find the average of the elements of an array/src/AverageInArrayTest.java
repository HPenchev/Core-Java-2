import static org.junit.Assert.*;

import org.junit.Test;


public class AverageInArrayTest {
    @Test
    public void testGetAverage() {
        int testArr[] = new int[] { 1, 2151, 125, 125, 1125, 16, 754, 132, 613, -51521, 51251, 675, 125366 };

        float avg = 0;
        for (int i = 0; i < testArr.length; i++) {
            avg += testArr[i];
        }
        avg /= testArr.length;

        assertEquals(avg, AverageInArray.getAverage(testArr), 0.01f);
    }
}