import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

    @Test
    public void test() {
        assertEquals("8.0", Calculator.calculateTwoNumbers("5+3"));
        assertEquals("2.2", Calculator.calculateTwoNumbers("5.2-3"));        
    }

}
