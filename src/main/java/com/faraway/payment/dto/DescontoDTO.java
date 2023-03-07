package com.faraway.payment.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DescontoDTO {

	@JsonProperty("codigo_tipo_desconto")
	@NotBlank
	private String tipo;

	@JsonProperty("data_desconto")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate data;
	@JsonProperty("valor_desconto")
	private BigDecimal valor;
	
	@JsonProperty("percentual_desconto")
	private Float percentual;
}
