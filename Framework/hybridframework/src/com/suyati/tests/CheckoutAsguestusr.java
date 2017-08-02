package com.suyati.tests;
import org.junit.Test;

import com.suyati.frameworkengine.TestExecutor;



public class CheckoutAsguestusr {

	@Test
	public void testCheckoutAsguestusr() throws Exception {
		System.out.println("Starting CheckoutAsguestusr scenario");
		TestExecutor exe = new TestExecutor();
		exe.executeTest("CheckoutAsguestusr");
		System.out.println("Ending CheckoutAsguestusr scenario");
	}

}
