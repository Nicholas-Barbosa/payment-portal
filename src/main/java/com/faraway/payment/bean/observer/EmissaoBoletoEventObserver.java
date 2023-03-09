package com.faraway.payment.bean.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoBoletoEventObserver implements ApplicationListener<EmissaoBoletoRequestEvent>,Observer {

	@Override
	public void onApplicationEvent(EmissaoBoletoRequestEvent event) {
		// TODO Auto-generated method stub
		System.out.println("emissao boleto event at: " + event.getGmtRequestedAt());
	}

}
