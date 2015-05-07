package com.sug.demo.service;

public class CustomerService {
	private String message;

	public CustomerService() {
		this.message = "CustomerService";
	}

	public CustomerService(String message) {
		this.message = message;
	}

	public String ping() {
		return "Pong from " + message;
	}
}
