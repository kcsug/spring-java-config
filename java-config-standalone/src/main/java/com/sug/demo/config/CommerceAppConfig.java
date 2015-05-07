package com.sug.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sug.demo.service.ProductService;

@Configuration
public class CommerceAppConfig {

	@Bean(name="pService", initMethod="setup")
	@Scope("prototype") //shutdown method is not called on prototype scope
	ProductService productService() {
		return new ProductService("ProductService Prototype");
	}
	@Bean(name="psService") 
	ProductService productsService() {
		return new ProductService("ProductService 2");
	}
}
