package com.faraway.payment.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosIndividuaisBoleto {

	@JsonProperty("numero_nosso_numero")
	private String bankNossoNumero;

	@JsonProperty("data_vencimento")
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataVencimento;
	@JsonProperty("valor_titulo")
	@NotNull
	private BigDecimal valorTitulo;
	@JsonProperty("data_limite_pagamento")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataLimitePagamento;
	@JsonProperty("texto_uso_beneficiario")
	@Size(max = 25)
	private String textoUsoBeneficiario;
	@JsonProperty("texto_seu_numero")
	private String textoSeuNumero;
	@JsonProperty("mensagens_cobranca")
	private MensagemCobranca mensagensCobranca;
	public String getBankNossoNumero() {
		return bankNossoNumero;
	}
	public void setBankNossoNumero(String bankNossoNumero) {
		this.bankNossoNumero = bankNossoNumero;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public BigDecimal getValorTitulo() {
		return valorTitulo;
	}
	public void setValorTitulo(BigDecimal valorTitulo) {
		this.valorTitulo = valorTitulo;
	}
	public LocalDate getDataLimitePagamento() {
		return dataLimitePagamento;
	}
	public void setDataLimitePagamento(LocalDate dataLimitePagamento) {
		this.dataLimitePagamento = dataLimitePagamento;
	}
	public String getTextoUsoBeneficiario() {
		return textoUsoBeneficiario;
	}
	public void setTextoUsoBeneficiario(String textoUsoBeneficiario) {
		this.textoUsoBeneficiario = textoUsoBeneficiario;
	}
	public String getTextoSeuNumero() {
		return textoSeuNumero;
	}
	public void setTextoSeuNumero(String textoSeuNumero) {
		this.textoSeuNumero = textoSeuNumero;
	}
	public MensagemCobranca getMensagensCobranca() {
		return mensagensCobranca;
	}
	public void setMensagensCobranca(MensagemCobranca mensagensCobranca) {
		this.mensagensCobranca = mensagensCobranca;
	}
	
	
}
