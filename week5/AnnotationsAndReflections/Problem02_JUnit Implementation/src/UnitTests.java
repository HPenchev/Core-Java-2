
public class UnitTests {
    @CustomTest
    public void runFirstTest() {
        System.out.println("First test has been run");
    }
    
    @CustomTest
    public void runSecondTest() {
        System.out.println("Second test has been run");
    }
    
    @CustomBefore
    public void runBeforeTest() {
        System.out.println("Before test run");
    }
    
    @CustomAfter
    public void runAfterTest() {
        System.out.println("After test run");
    }
}