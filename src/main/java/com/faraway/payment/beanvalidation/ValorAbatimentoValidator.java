package com.faraway.payment.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.faraway.payment.dto.DadoBoletoDTO;

public class ValorAbatimentoValidator implements ConstraintValidator<ValorAbatimentoConstraint, DadoBoletoDTO> {

	@Override
	public boolean isValid(DadoBoletoDTO value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value.getValorAbatimento() != null) {
			int r = value.getValorAbatimento().compareTo(value.getValorTotalTitulo());
			return r == -1 || r == 0;
		}
		return true;
	}

}
