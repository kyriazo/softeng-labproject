package com.teipir.softeng.MedicaApp;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddPatientTest {

	@Test
	public void testAnoikse() {
		AddPatient tester = new AddPatient();
		assertEquals("Result", 1, tester.Anoikse());
	}

	@Test
	public void testOpen() {
		AddPatient tester = new AddPatient();
		assertEquals("Result", 1, tester.open());
	}

	@Test
	public void testCreateContents() {
		AddPatient tester = new AddPatient();
		assertEquals("Result", 1, tester.createContents());
	}

}
