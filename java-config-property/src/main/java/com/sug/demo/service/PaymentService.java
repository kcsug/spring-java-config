package com.sug.demo.service;

public class PaymentService {
	private String paymentSystem;
	private String paymentUrl;
	public PaymentService(String paymentSystem, String paymentUrl) {
		this.paymentUrl = paymentUrl;
		this.paymentSystem = paymentSystem;	
	}
	public String ping() {
		return "Pong from Payment System=" + paymentSystem +", paymenturl="+paymentUrl;
	}
}
