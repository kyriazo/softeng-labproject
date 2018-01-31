package com.teipir.softeng.MedicaApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainScreenTest {

	@Test
	public void testAnoikse() {
		MainScreen tester = new MainScreen();
		assertEquals("Result", 1, tester.Anoikse());
	}

	@Test
	public void testOpen() {
		MainScreen tester = new MainScreen();
		assertEquals("Result", 1, tester.open());
		
	}

	@Test
	public void testCreateContents() {
		MainScreen tester = new MainScreen();
		assertEquals("Result", 1, tester.createContents());
	}

}
