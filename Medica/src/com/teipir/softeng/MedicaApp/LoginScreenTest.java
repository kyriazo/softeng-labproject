package com.teipir.softeng.MedicaApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginScreenTest {

	@Test
	public void testMain() {
		LoginScreen tester = new LoginScreen();
		assertEquals("Result", 1, tester.open());
	}

	@Test
	public void testOpen() {
		LoginScreen tester = new LoginScreen();
		assertEquals("Result", 1, tester.open());
	}

	@Test
	public void testCreateContents() {
		LoginScreen tester = new LoginScreen();
		assertEquals("Result", 1, tester.createContents());
	}

}
