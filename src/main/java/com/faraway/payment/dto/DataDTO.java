package com.faraway.payment.dto;

import javax.validation.GroupSequence;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.faraway.payment.beanvalidation.BeneficiarioValidationGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

@GroupSequence({ BeneficiarioValidationGroup.class, DataDTO.class })
public class DataDTO {

	@JsonProperty("etapa_processo_boleto")
	@NotBlank
	private String etapaProcessoBoleto;

	@JsonProperty("beneficiario")
	@NotNull(groups = BeneficiarioValidationGroup.class)
	@Valid
	private BeneficiarioDTO beneficiarioDTO;

	@JsonProperty("dado_boleto")
	@NotNull(message = "dado_boleto não deve ser nulo")
	@Valid
	private DadoBoletoDTO dadoBoleto;

	public String getEtapaProcessoBoleto() {
		return etapaProcessoBoleto;
	}

	public void setEtapaProcessoBoleto(String etapaProcessoBoleto) {
		this.etapaProcessoBoleto = etapaProcessoBoleto;
	}

	public BeneficiarioDTO getBeneficiarioDTO() {
		return beneficiarioDTO;
	}

	public void setBeneficiarioDTO(BeneficiarioDTO beneficiarioDTO) {
		this.beneficiarioDTO = beneficiarioDTO;
	}

	public DadoBoletoDTO getDadoBoleto() {
		return dadoBoleto;
	}

	public void setDadoBoleto(DadoBoletoDTO dadoBoleto) {
		this.dadoBoleto = dadoBoleto;
	}

}
