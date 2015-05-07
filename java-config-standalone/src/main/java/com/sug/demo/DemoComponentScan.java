package com.sug.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sug.demo.service.ProductService;

public class DemoComponentScan {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//Creating container with Java Based configuration, any class with @Configuration or @Component or any JSR 330 annotation
		context.scan("com.sug.demo.config");
		context.refresh(); //Important to call refresh
		ProductService pService = context.getBean("pService", ProductService.class);
		System.out.println(pService.ping());
		context.close();
	}

}
