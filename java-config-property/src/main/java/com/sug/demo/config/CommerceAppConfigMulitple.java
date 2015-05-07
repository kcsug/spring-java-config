package com.sug.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.sug.demo.service.PaymentService;

@Configuration
@PropertySource({"classpath:/payment-system-${env.name:dev}.properties", "classpath:/banks.properties"})
//@PropertySources({
//	@PropertySource("classpath:/payment-system-${env.name:dev}.properties"),
//	@PropertySource(value="file:/config-location/banks.properties", ignoreResourceNotFound=true)
//})
public class CommerceAppConfigMulitple {
	@Autowired
	Environment env1;

	@Bean
	public PaymentService paymentService() {
		return new PaymentService(env1.getProperty("payment.system") + env1.getProperty("payment.system"), env1.getProperty("payment.system.url"));
	}
}
