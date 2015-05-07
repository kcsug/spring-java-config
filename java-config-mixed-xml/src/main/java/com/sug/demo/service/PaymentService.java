package com.sug.demo.service;

public class PaymentService {
	private String message;

	public PaymentService() {
		this.message = "PaymentService";
	}

	public String ping() {
		return "Pong from " + message;
	}

}
