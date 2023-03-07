package com.faraway.payment.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PessoaDTO {

	@JsonProperty("nome_pessoa")
	@NotBlank
	@Size(max = 50)
	private String nome;

	@JsonProperty("nome_fantasia")
	@Size(max = 50)
	private String nomeFantasia;

	@JsonProperty("tipo_pessoa")
	@NotNull
	private TipoPessoaDTO tipoPessoaDTO;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public TipoPessoaDTO getTipoPessoaDTO() {
		return tipoPessoaDTO;
	}

	public void setTipoPessoaDTO(TipoPessoaDTO tipoPessoaDTO) {
		this.tipoPessoaDTO = tipoPessoaDTO;
	}

	public static class TipoPessoaDTO {
		@NotNull
		private TipoPessoa tipo;
		@Size(max = 11)
		private String cpf;
		@Size(max = 14)
		private String cnpj;

		public TipoPessoa getTipo() {
			return tipo;
		}

		public void setTipo(TipoPessoa tipo) {
			this.tipo = tipo;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

	}
}
