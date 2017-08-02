package com.suyati.tests;
import org.junit.Test;

import com.suyati.frameworkengine.TestExecutor;

public class CheckoutAsloginusr {

	@Test
	public void testCheckoutAsloginusrt() throws Exception {
		System.out.println("Starting CheckoutAsloginusr scenario");
		TestExecutor exe = new TestExecutor();
		exe.executeTest("CheckoutAsloginusr");
		System.out.println("Ending CheckoutAsloginusrscenario");
	}

}








