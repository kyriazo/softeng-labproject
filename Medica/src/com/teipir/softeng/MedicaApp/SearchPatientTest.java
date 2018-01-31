package com.teipir.softeng.MedicaApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchPatientTest {

	@Test
	public void testMain() {
		SearchPatient tester = new SearchPatient();
		assertEquals("Result", 1, tester.open());
	}

	@Test
	public void testOpen() {
		SearchPatient tester = new SearchPatient();
		assertEquals("Result", 1, tester.open());
	}

	@Test
	public void testCreateContents() {
		SearchPatient tester = new SearchPatient();
		assertEquals("Result", 1, tester.createContents());
	}

}
