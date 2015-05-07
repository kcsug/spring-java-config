package com.sug.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sug.demo.service.CustomerService;
import com.sug.demo.service.PaymentService;
import com.sug.demo.service.ProductService;

public class DemoMixed {

	public static void main(String[] args) {
		//Creating container with Java Based configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/application-context.xml");
		//Looking up by bean by name
		ProductService pService = context.getBean(ProductService.class);
		System.out.println(pService.ping());
		PaymentService paymentService = context.getBean(PaymentService.class);
		System.out.println(paymentService.ping());
		System.out.println(context.getBean("customerService", CustomerService.class).ping());
		context.close();
	}
}
