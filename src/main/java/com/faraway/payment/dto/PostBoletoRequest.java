package com.faraway.payment.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class PostBoletoRequest {

	@NotNull
	@Valid
	private DataDTO data;

	public DataDTO getData() {
		return data;
	}

	public void setData(DataDTO data) {
		this.data = data;
	}

}
