package com.faraway.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.faraway.payment.bean")
public class PaymentPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentPortalApplication.class, args);
	}

}
