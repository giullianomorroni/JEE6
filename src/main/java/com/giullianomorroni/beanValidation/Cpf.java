package com.giullianomorroni.beanValidation;


import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({METHOD,FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented
public @interface Cpf {

	String message() default "CPF Inválido";

}
