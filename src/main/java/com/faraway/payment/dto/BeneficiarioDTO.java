package com.faraway.payment.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BeneficiarioDTO {
	@JsonProperty("id_beneficiario")
	@Size(max = 12, message = "id_beneficario inválido. Agência (4 dígitos) + Conta (7 dígitos) + DAC (1 dígito). Exemplo: 150000123450")
	@NotBlank
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
