package com.dev.currencyconverter.controller;

import com.dev.currencyconverter.model.CurrencyConversionResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConverterController {
	
	
	@GetMapping("/convert")
	public CurrencyConversionResult convert(
			@RequestParam double currency_amount,
			@RequestParam String from_currency,
			@RequestParam String to_currency) {
		
		double rate = 0.93;
		double converted_currency_amount = currency_amount * rate;
		
		return new CurrencyConversionResult(currency_amount, from_currency,to_currency, converted_currency_amount);
	}
	
}