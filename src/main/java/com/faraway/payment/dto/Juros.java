package com.faraway.payment.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Juros {

	@JsonProperty("codigo_tipo_juros")
	@NotBlank
	private String tipoCobranca;
	@JsonProperty("valor_juros")
	private BigDecimal valor;
	@JsonProperty("percentual_juros")
	private Float percentual;
	@JsonProperty("data_juros")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate data;
	public String getTipoCobranca() {
		return tipoCobranca;
	}
	public void setTipoCobranca(String tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
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
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
}
