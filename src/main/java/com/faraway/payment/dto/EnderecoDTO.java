package com.faraway.payment.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoDTO {

	@JsonProperty("nome_logradour")
	@NotBlank
	@Size(max = 45)
	private String logradouro;

	@JsonProperty("nome_bairro")
	@NotBlank
	@Size(max = 15)
	private String bairro;

	@JsonProperty("cidade")
	@NotBlank
	@Size(max = 20)
	private String cidade;

	@JsonProperty("sigla_uf")
	@NotBlank
	@Size(max = 2)
	private String ufAcronym;

	@JsonProperty("numero_cep")
	@NotBlank
	@Size(max = 8, min = 8)
	private String cep;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUfAcronym() {
		return ufAcronym;
	}

	public void setUfAcronym(String ufAcronym) {
		this.ufAcronym = ufAcronym;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
