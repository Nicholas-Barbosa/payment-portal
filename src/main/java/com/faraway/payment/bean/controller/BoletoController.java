package com.faraway.payment.bean.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import com.faraway.payment.dto.PostBoletoRequest;

@RestController
@RequestMapping("boletos")
public class BoletoController {

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> post(@Valid @RequestBody PostBoletoRequest boletoDTO) {
		return ResponseEntity.status(201).build();
	}
}
