package com.dev.currencyconverter.model;

import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ExchangeRateResponseTest {
	
	@Test
	public void testExchangeRateApiResponse() {
		
		ExchangeRateApiResponse response = new ExchangeRateRespone("success", "EUR", "GBP", 0.8412, 5.8884);
		
		assertEquals("success", response.getResult_status());
		assertEquals("EUR", response.getBase_code());
		assertEquals("GBP", response.getTarget_code());
		assertEquals(0.8412, response.getConversion_rate());
		assertEquals(5.884, response.getConversion_result());
	}
}