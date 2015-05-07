package com.sug.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sug.demo.service.PaymentService;

@Configuration
public class PaymentAppConfig {

	@Bean
	public PaymentService paymentService() {
		return new PaymentService();
	}
}
