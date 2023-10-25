package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.TYPE,ElementType.METHOD}) // cel antoacji
@Retention(RetentionPolicy.RUNTIME) // kiedy będzie widoczna/w użyciu
public @interface VeryImportant {
}
