package com.giullianomorroni.beanValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidadorCpf implements ConstraintValidator<Cpf, String> {

	private String cpf;

	public void initialize(Cpf cpf) {
		this.cpf = cpf.toString();
	}

	public boolean isValid(String cpf, ConstraintValidatorContext context) {
		//TODO IMPLEMENTAR A VALIDAÇÃO...
		if (this.cpf == null)
			return false;
		else
			return true;
	}

}
