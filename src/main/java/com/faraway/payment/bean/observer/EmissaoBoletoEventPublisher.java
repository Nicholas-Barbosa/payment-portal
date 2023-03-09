package com.faraway.payment.bean.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EmissaoBoletoEventPublisher {

	@Autowired
	private ApplicationEventPublisher publisher;
	@Autowired
	private ApplicationContext applicationContext;

	public void publishCustomEvent() {
		System.out.println("Publishing custom event. ");
		EmissaoBoletoRequestEvent customSpringEvent = new EmissaoBoletoRequestEvent(this);
		publisher.publishEvent(customSpringEvent);
		applicationContext.getBeansOfType(Observer.class).entrySet()
				.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
		;
	}
}
