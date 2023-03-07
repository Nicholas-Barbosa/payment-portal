package com.faraway.payment.dto;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagadorDTO {

	@JsonProperty("pagador")
	@NotNull
	private PessoaDTO pessoa;
	@JsonProperty("endereco")
	@NotNull
	private EnderecoDTO enderecoDTO;

	public PessoaDTO getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
	}

	public EnderecoDTO getEnderecoDTO() {
		return enderecoDTO;
	}

	public void setEnderecoDTO(EnderecoDTO enderecoDTO) {
		this.enderecoDTO = enderecoDTO;
	}

}
