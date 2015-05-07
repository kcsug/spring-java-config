package com.sug.demo.service;

public class ProductService {
	private String message;
	public ProductService() {this.message = "ProductService";}
	public ProductService(String message) {this.message = message;}
	public String ping() {
		return "Pong from " +message;
	}

}
