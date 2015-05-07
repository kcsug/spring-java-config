package com.sug.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sug.demo.service.ProductService;

@Configuration
public class CommerceAppConfigSimple {

	@Bean 
	ProductService productService() {
		return new ProductService("Hello");
	}
}
