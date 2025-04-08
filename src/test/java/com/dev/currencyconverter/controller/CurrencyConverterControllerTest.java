package com.dev.currencyconverter.controller;

import com.dev.currencyconverter.model.CurrencyConversionResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class CurrencyConverterControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void test_convert_endpoint_returns_json_response() throws Exception {
		mockMvc.perform(get("/convert")
				.param("amount","100")
				.param("from", "USD")
				.param("to", "EUR"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.amount").value(100.0))
				.andExpect(jsonPath("$.from").value("USD"))
				.andExpect(jsonPath("$.to").value("EUR"))
				.andExpect(jsonPath("$.converted").value(93.0));
	}
	
}