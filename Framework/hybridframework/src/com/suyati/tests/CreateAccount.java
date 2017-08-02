package com.suyati.tests;
import org.junit.Test;

import com.suyati.frameworkengine.TestExecutor;



public class CreateAccount {

	@Test
	public void testCreateAccount() throws Exception {
		System.out.println("Starting CreateAccount scenario");
		TestExecutor exe = new TestExecutor();
		exe.executeTest("CreateAccount");
		System.out.println("Ending CreateAccount scenario");
	}

}
