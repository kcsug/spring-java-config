package com.sug.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.sug.demo.service.PaymentService;

@Configuration
@PropertySource("classpath:/payment-system-${env.name:dev}.properties")
public class CommerceAppConfigEnvironment {
	//-Denv.name=test
	@Autowired
	Environment envPropertiers;

	@Bean
	public PaymentService paymentService() {
		return new PaymentService(envPropertiers.getProperty("payment.system"), envPropertiers.getProperty("payment.system.url"));
	}
}
