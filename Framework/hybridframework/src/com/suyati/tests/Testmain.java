package com.suyati.tests;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;


public class Testmain {


	
		/**
		 * @param args
		 * @throws InterruptedException 
		 */
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","E:\\Project\\Framework_SAIG\\hybridframework\\lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://infostore.saiglobal.com/en-au/Create-Account/");
			driver.manage().window().maximize();
			WebElement ele;
			Thread.sleep(2000);
			System.out.println("d");
			ele=driver.findElement(By.xpath("//h2/a[contains(text(),'Additional Information')]"));
			ele.click();
			System.out.println("2");
			Thread.sleep(5000);
		
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementsByClassName('btn btn-uppercase pull-right btn-register')[0].removeAttribute('disabled');");
			//jse.executeScript("x[0].placeholder='hi';");
			
/*jse.executeScript("document.getElementsByClassName('btn btn-uppercase pull-right btn-register').removeAttribute('disabled');");
			
		//	ele=(WebElement) jse.executeScript("document.getElementsByClassName('btn btn-uppercase pull-right btn-register');");
			//System.out.println(ele.getAttribute("button"));  */
			
			
			Thread.sleep(3000);
	
		
		

 
		
		
		
		}
	}


