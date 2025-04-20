package com.dev.currencyconverter.model;


public class CurrencyConversionResult{
	
	private double currency_amount;
	private String from_currency;
	private String to_currency;
	private double converted_currency_amount;
	
	public CurrencyConversionResult(double currency_amount, String from_currency, String to_currency, double converted_currency_amount) {
		this.currency_amount = currency_amount;
		this.from_currency = from_currency;
		this.to_currency = to_currency;
		this.converted_currency_amount = converted_currency_amount;
	}
	
	public double getCurrency_amount() {
		return this.currency_amount;
	}
	
	public String getFrom_currency() {
		return this.from_currency;
	}
	
	public String getTo_currency() {
		return this.to_currency;
	}
	
	public double getConverted_currency_amount() {
		return this.converted_currency_amount;
	}
	
	
}