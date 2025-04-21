package com.dev.currencyconverter.model;


public class ExchangeRateApiResponse {
	private String result_status;
	private String base_code;
	private String target_code;
	private double conversion_rate;
	private double conversion_result;
	
	public ExchangeRateApiResponse(String result_status, String base_code, String target_code, double conversion_rate, double conversion_result) {
		this.result_status = result_status;
		this.base_code = base_code;
		this.target_code = target_code;
		this.conversion_rate = conversion_rate;
		this.conversion_result = conversion_result;
	}
	
	public String getResult_status() {
		return this.result_status;
	}
	
	public String getBase_code() {
		return this.base_code;
	}
	
	public String getTarget_code() {
		return this.target_code;
	}
	
	public double getConversion_rate() {
		return this.conversion_rate;
	}
	
	public double getConversion_result() {
		return this.conversion_result;
	}
	
}