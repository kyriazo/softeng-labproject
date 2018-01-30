package com.teipir.softeng.MedicaApp;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class dbConnectionTest {
	
	@Test
	public void testSignIn() {
		dbConnection tester = new dbConnection();
		assertFalse("Does SignIn return false?", tester.SignIn(tester.getUsername(), tester.getPassword()));
	}
	
	//@Test
	//public void testSignInInfo() {
	//	dbConnection tester = new dbConnection();
	//	assertFalse("Does SignIn return false?", tester.SignIn("giatros", "giatros"));
	//}
	

	@Test
	public void testaddPatient() {
		dbConnection tester = new dbConnection();
		//assertEquals("Result", 1, tester.addPatient());
	}

}
