package com.faraway.payment.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecebimentoDivergente {

	@JsonProperty("codigo_tipo_autorizacao")
	@NotBlank
	private String tipoAutorizacao;
	
	@JsonProperty("codigo_tipo_recebimento")
	private String tipoRecebimento;
	
	@JsonProperty("valor_minimo")
	private BigDecimal valorMinimo;
	
	@JsonProperty("percentual_minimo")
	private Float percentualMinimo;
	
	@JsonProperty("valor_maximo")
	private BigDecimal valorMaximo;
	
	@JsonProperty("percentual_maximo")
	private Float percentualMaximo;

	public String getTipoAutorizacao() {
		return tipoAutorizacao;
	}

	public void setTipoAutorizacao(String tipoAutorizacao) {
		this.tipoAutorizacao = tipoAutorizacao;
	}

	public String getTipoRecebimento() {
		return tipoRecebimento;
	}

	public void setTipoRecebimento(String tipoRecebimento) {
		this.tipoRecebimento = tipoRecebimento;
	}

	public BigDecimal getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(BigDecimal valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public Float getPercentualMinimo() {
		return percentualMinimo;
	}

	public void setPercentualMinimo(Float percentualMinimo) {
		this.percentualMinimo = percentualMinimo;
	}

	public BigDecimal getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(BigDecimal valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	public Float getPercentualMaximo() {
		return percentualMaximo;
	}

	public void setPercentualMaximo(Float percentualMaximo) {
		this.percentualMaximo = percentualMaximo;
	}
	
	
}
