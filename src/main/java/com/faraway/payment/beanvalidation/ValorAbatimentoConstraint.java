package com.faraway.payment.beanvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = ValorAbatimentoValidator.class)
public @interface ValorAbatimentoConstraint {

	String message() default "Valor do abatimento do título não pode superar o valor da cobrança.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
