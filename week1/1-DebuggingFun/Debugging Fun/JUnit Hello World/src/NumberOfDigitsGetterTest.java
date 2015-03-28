import static org.junit.Assert.*;

import org.junit.Test;


public class NumberOfDigitsGetterTest {

    @Test
    public void test() {
        assertEquals(4, NumberOfDigitsGetter.getNumberOfDigits(5975));
        assertEquals(4, NumberOfDigitsGetter.getNumberOfDigits(1000));
        assertEquals(3, NumberOfDigitsGetter.getNumberOfDigits(999));
        assertEquals(1, NumberOfDigitsGetter.getNumberOfDigits(0));
        assertEquals(4, NumberOfDigitsGetter.getNumberOfDigits(-5975));
        assertEquals(4, NumberOfDigitsGetter.getNumberOfDigits(-1000));
        assertEquals(3, NumberOfDigitsGetter.getNumberOfDigits(-999));
        assertEquals(1, NumberOfDigitsGetter.getNumberOfDigits(-1));
    }

}
