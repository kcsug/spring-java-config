package com.sug.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sug.demo.config.CommerceAppConfig;
import com.sug.demo.service.ProductService;

public class Demo {

	public static void main(String[] args) {
		//Creating container with Java Based configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CommerceAppConfig.class);
		//Looking up by bean by name
		ProductService pService = context.getBean("pService", ProductService.class);
		System.out.println(pService.ping());
		ProductService p1Service = context.getBean("psService", ProductService.class);
		System.out.println(p1Service.ping());
		context.close();
	}
}
