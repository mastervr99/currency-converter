package com.dev.currencyconverter.model;

public class UserRequest {
	
	private double amount;
	private String source_currency;
	private String target_currency;
	
	public UserRequest(double amount, String source_currency, String target_currency) {
		this.amount = amount;
		this.source_currency = source_currency;
		this.target_currency = target_currency;
	}
	
	
	public double get_amount() {
		return this.amount;
	}


	public String get_source_currency() {
		return this.source_currency;
	}
	
	public String get_target_currency() {
		return this.target_currency;
	}
	
}