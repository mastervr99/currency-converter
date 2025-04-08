package com.dev.currencyconverter.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRequestTest {
	
	@Test
	public void testUserRequestFields() {
		UserRequest user_request = new UserRequest();
		user_request.set_amount(50);
		user_request.set_source_currency("EUR");
		user_request.set_target_currency("USD");
		
		assertEquals(50,user_request.get_amount());
		assertEquals("EUR", user_request.get_source_currency());
		assertEquals("USD", user_request.get_target_currency());
		
	}
}

