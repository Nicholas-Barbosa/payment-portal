package com.faraway.payment.bean.observer;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.springframework.context.ApplicationEvent;

public class EmissaoBoletoRequestEvent extends ApplicationEvent {

	private final LocalDateTime gmtRequestedAt = LocalDateTime.now(ZoneOffset.UTC);

	public EmissaoBoletoRequestEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getGmtRequestedAt() {
		return gmtRequestedAt;
	}

}
