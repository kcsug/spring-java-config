package com.sug.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sug.demo.config.CommerceAppConfigEnvironment;
import com.sug.demo.service.PaymentService;

public class DemoProperty {

	public static void main(String[] args) {
		// Creating container with Java Based configuration
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CommerceAppConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CommerceAppConfigEnvironment.class);
		
		PaymentService pService = context.getBean(PaymentService.class);
		System.out.println(pService.ping());
		context.close();
	}
}
