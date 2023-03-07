package com.faraway.payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Negativacao {

	private boolean negativacao;
	
	@JsonProperty("quantidade_dias_negativacao")
	private int qauntidadeDias;

	public boolean isNegativacao() {
		return negativacao;
	}

	public void setNegativacao(boolean negativacao) {
		this.negativacao = negativacao;
	}

	public int getQauntidadeDias() {
		return qauntidadeDias;
	}

	public void setQauntidadeDias(int qauntidadeDias) {
		this.qauntidadeDias = qauntidadeDias;
	}
	
	
}
