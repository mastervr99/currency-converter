package com.dev.currencyconverter.model;

public class UserRequest {
	
	private double amount;
	private String source_currency;
	private String target_currency;
	
	public void set_amount(double amount) {
		this.amount = amount;
	}
	
	public double get_amount() {
		return this.amount;
	}
	
	public void set_source_currency(String source_currency) {
		this.source_currency = source_currency;
	}

	public String get_source_currency() {
		return this.source_currency;
	}
	
	public void set_target_currency(String target_currency) {
		this.target_currency = target_currency;
	}
	
	public String get_target_currency() {
		return this.target_currency;
	}
	
}