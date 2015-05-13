import java.lang.annotation.Retention;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @Retention(RetentionPolicy.RUNTIME) @interface ClassInfo {
    String author();
    int revisionOfTheClass() default 1;
    boolean isChecked() default true;
    Class<?>[] relatedClasses();
}