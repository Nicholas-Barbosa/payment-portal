package com.faraway.payment.dto;

public enum TipoPessoa {

	F("FISICA"), J("JURÍDICA");

	private String tipo;

	private TipoPessoa(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
