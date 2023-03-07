package com.faraway.payment.dto;

import javax.validation.constraints.NotBlank;

public class MensagemCobranca {

	@NotBlank
	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
