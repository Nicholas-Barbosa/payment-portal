package com.faraway.payment.bean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faraway.payment.bean.observer.EmissaoBoletoEventPublisher;

@RestController
@RequestMapping("hello")
public class HelloController {

	@Autowired
	private EmissaoBoletoEventPublisher publisher;
	@GetMapping
	public ResponseEntity<?> sayHello() {
		publisher.publishCustomEvent();
		return ResponseEntity.status(200).body("Hello");
	}
}
