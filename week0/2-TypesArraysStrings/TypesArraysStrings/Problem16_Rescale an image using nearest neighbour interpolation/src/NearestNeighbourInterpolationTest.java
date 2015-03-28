import static org.junit.Assert.*;

import org.junit.Test;


public class NearestNeighbourInterpolationTest {

    @Test
    public void testRescale() {
        final int[][] original = new int[100][100];
        int counter = 0;
        for (int y = 0; y < original.length; y++) {
            for (int x = 0; x < original[0].length; x++) {
                original[y][x] = counter++;
            }
        }

        final int newWidth = 10;
        final int newHeight = 10;

        final int[][] newImage = NearestNeighbourInterpolation.rescale(
                original, 
                newWidth, 
                newHeight
                );
        assertEquals(newImage[0][0], original[0][0]);
        assertEquals(newImage[9][9], original[90][90]);
        assertEquals(newImage[0][9], original[0][90]);
        assertEquals(newImage[9][0], original[90][0]);
    }

}
