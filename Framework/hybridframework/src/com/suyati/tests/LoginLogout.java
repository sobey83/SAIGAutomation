package com.suyati.tests;
import org.junit.Test;

import com.suyati.frameworkengine.TestExecutor;



public class LoginLogout {

	@Test
	public void testLoginLogout() throws Exception {
		System.out.println("Starting LoginLogout scenario");
		TestExecutor exe = new TestExecutor();
		exe.executeTest("LoginLogout");
		System.out.println("Ending LoginLogout scenario");
	}

}
