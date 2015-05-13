import java.lang.reflect.InvocationTargetException;


public class UnitTestMain {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
        Test test = new Test(UnitTests.class);
        test.run();
    }
}
