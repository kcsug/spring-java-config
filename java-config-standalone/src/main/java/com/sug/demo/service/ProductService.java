package com.sug.demo.service;

public class ProductService {
	private String message;

	public ProductService() {
		this.message = "ProductService";
	}

	public ProductService(String message) {
		this.message = message;
	}

	public String ping() {
		return "Pong from " + message + " - " + new Double(Math.random() * 1000).intValue();
	}

	public void setup() {
		System.out.println("In Setup");
	}
	//a method with name close or shutdown are automatically registered as "deployMethod"
	public void shutdown() {
		System.out.println("In shutdown "+ message);
	}
}
