package problemCardsWithPower.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Niki on 20.7.2016 г..
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Suit {
    String type = "Enumeration";
    String category = "Suit";
    String description = "Provides suit constants for a Card class.";
}
