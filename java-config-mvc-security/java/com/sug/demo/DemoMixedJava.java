package com.sug.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sug.demo.config.CommerceAppConfig;
import com.sug.demo.service.PaymentService;
import com.sug.demo.service.ProductService;

public class DemoMixedJava {

	public static void main(String[] args) {
		//Creating container with Java Based configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CommerceAppConfig.class);
		//Looking up by bean by name
		ProductService pService = context.getBean(ProductService.class);
		System.out.println(pService.ping());
		PaymentService paymentService = context.getBean(PaymentService.class);
		System.out.println(paymentService.ping());
		context.close();
	}
}
