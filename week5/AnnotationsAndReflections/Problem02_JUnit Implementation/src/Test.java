import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Test {
    private Class<?> classTested;
    public Test (Class<?> classTested) {
        this.classTested = classTested;
    }
    
    public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        Method[] methods = classTested.getDeclaredMethods();
        invokeMethodsByAnnotation(methods, CustomBefore.class);
        invokeMethodsByAnnotation(methods, CustomTest.class);
        invokeMethodsByAnnotation(methods, CustomAfter.class);
    }

    private void invokeMethodsByAnnotation(Method[] methods, Class<? extends Annotation> annotationToRun) 
            throws InstantiationException, IllegalAccessException, InvocationTargetException {
        for (Method method : methods) {
            Annotation annotation = method.getAnnotation(annotationToRun);
            //annotation.annotationType()
            if (annotation != null &&  annotation.annotationType() == annotationToRun) {
                Object testObject = classTested.newInstance();
                method.invoke(testObject);
            }
        }
    }
}
