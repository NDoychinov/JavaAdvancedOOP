package problemInfernoInfinity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Niki on 21.7.2016 г..
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InfinitiInfo {
    String author = "Pesho";
    String revision = "3";
    String description = "Used for Java OOP Advanced course - Enumerations and Annotations.";
    String  reviewers = "Pesho, Svetlio";

}
