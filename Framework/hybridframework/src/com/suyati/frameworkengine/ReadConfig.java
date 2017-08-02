package com.suyati.frameworkengine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	public String getConfiguration(String logicalName) throws IOException {
		String retVal=null;
		 String current = new java.io.File( "." ).getCanonicalPath();
	        System.out.println("Current dir:"+current);
		try {
			FileInputStream fis = new FileInputStream("../config/config.properties");
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
