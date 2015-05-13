import java.lang.annotation.Annotation;

public class TestClassMain {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        Annotation[] annotations = testClass.getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
