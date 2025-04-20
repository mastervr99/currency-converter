package com.dev.currencyconverter.controller;

import com.dev.currencyconverter.model.CurrencyConversionResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CurrencyConverterController.class)
public class CurrencyConverterControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void test_convert_endpoint_returns_json_response() throws Exception {
		mockMvc.perform(get("/convert")
					.param("currency_amount","100")
					.param("from_currency", "USD")
					.param("to_currency", "EUR"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.currency_amount").value(100.0))
				.andExpect(jsonPath("$.from_currency").value("USD"))
				.andExpect(jsonPath("$.to_currency").value("EUR"))
				.andExpect(jsonPath("$.converted_currency_amount").value(93.0));
	}
	
}