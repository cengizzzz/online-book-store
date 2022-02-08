package com.example.stockmicroservis.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy= Isbn.class)
public @interface IsbnValidation {
    String message() default "{validation.isbn}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}