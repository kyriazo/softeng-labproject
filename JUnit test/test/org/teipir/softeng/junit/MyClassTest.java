package org.teipir.softeng.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyClassTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Starting...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Done!");
	}

	@Test
	void testMultiply() {
		
		MyClass tester = new MyClass();
		assertEquals("Result from multiply", 2, tester.multiply(10, 5));
		
	}
	
	@Test
	public void testMyString() {
		MyClass  tester = new MyClass();
		assertEquals(5,tester.mystring(true).length());
		assertEquals("hello",tester.mystring(true));
	}
}

