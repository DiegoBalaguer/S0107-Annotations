package level03.exercise01.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * PROGRAM: JsonSerializable
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
    String directory();
}
