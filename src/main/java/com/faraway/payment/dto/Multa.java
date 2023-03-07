package com.faraway.payment.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Multa {

	@JsonProperty("codigo_tipo_multa")
	@NotBlank
	private String tipo;
	@JsonProperty("valor_multa")
	private BigDecimal valor;
	@JsonProperty("percentual_multa")
	private Float percentual;
	@JsonProperty("quantidade_dias_multa")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate inicioCobranca;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Float getPercentual() {
		return percentual;
	}
	public void setPercentual(Float percentual) {
		this.percentual = percentual;
	}
	public LocalDate getInicioCobranca() {
		return inicioCobranca;
	}
	public void setInicioCobranca(LocalDate inicioCobranca) {
		this.inicioCobranca = inicioCobranca;
	}
	
	
}
