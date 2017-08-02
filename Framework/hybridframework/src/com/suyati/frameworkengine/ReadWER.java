package com.suyati.frameworkengine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadWER {

	/**
	 * @param args
	 */
	public String getElementFromRepository(String logicalName) {
		String retVal=null;
		try {
			FileInputStream fis = new FileInputStream("./wer/wer.properties");
			Properties properties = new Properties();
			properties.load(fis);
			retVal = properties.getProperty(logicalName);			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retVal;
	}
}
