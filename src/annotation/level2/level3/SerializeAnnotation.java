package annotation.level2.level3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public  @interface SerializeAnnotation {
    String file(); // Parámetro para especificar el archivo
}
