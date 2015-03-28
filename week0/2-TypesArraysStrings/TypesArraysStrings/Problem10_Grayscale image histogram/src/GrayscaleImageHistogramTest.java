import static org.junit.Assert.*;

import org.junit.Test;

public class GrayscaleImageHistogramTest {

    @Test
    public void testHistorgram() {
        final short[][] image = new short[10][10];
        assertEquals(100, GrayscaleImageHistogram.histogram(image)[0]);

        for (short i = 0; i < image.length; i++) {
            for (short j = 0; j < image[0].length; j++) {
                image[i][j] = (short) (i * image[0].length + j);
            }
        }

        assertEquals(1, GrayscaleImageHistogram.histogram(image)[13]);

        for (short i = 0; i < image.length; i++) {
            for (short j = 0; j < image[0].length; j++) {
                image[i][j] = (short) (i * j + j);
            }
        }
    }
}