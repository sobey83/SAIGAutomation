package com.suyati.tests;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class Stepprog {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		   WebDriver driver;
		   WebElement ele;
		/*	
		 *  
	
d
	     System.setProperty("webdriver.opera.driver","E:\\Project\\Framework_SAIG\\hybridframework\\lib\\operadriver.exe");
		  driver = new OperaDriver();
			System.setProperty("webdriver.gecko.driver", "E:\\Project\\Framework_SAIG\\hybridframework\\lib\\geckodriver.exe");
			driver =new FirefoxDriver();
	
			System.setProperty("webdriver.ie.driver","D:\\Framework\\hybridframework\\lib\\IEDriverServer.exe");
			DesiredCapabilities cap= new DesiredCapabilities();
				 driver  =  new InternetExplorerDriver();
			
			System.setProperty("webdriver.chrome.driver","E:\\Project\\Framework_SAIG\\hybridframework\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
		
			
			*/
		  
		   System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		
		   System.setProperty("webdriver.gecko.driver", "E:\\Project\\Framework_SAIG\\hybridframework\\lib\\geckodriver.exe");
		   
		   
		   
		   
		   
		driver =new FirefoxDriver();		
		//driver.get("https://www.facebook.com/");
		driver.get("https://suyati.com/careers/openings/");
	    String str=driver.getTitle();
		System.out.println(str);
	
		ele=driver.findElement(By.id("u_0_2"));
		ele.sendKeys("Sobey");
		
		ele=driver.findElement(By.name("lastname"));
		ele.sendKeys("mathew");
		
		ele=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		ele.sendKeys("2323");
		
		
		ele=driver.findElement(By.id("day"));
			
		Select sel=new Select(ele);
		sel.selectByIndex(2);
		
		
		ele=driver.findElement(By.id("month"));
		
		sel=new Select(ele);
		sel.selectByValue("2");
		
		ele=driver.findElement(By.id("year"));
		
		sel=new Select(ele);
		sel.selectByVisibleText("1997");
		
		Thread.sleep(1000);		
		
		ele=driver.findElement(By.partialLinkText("date of birth?"));
		ele.click();
		Thread.sleep(5000);
		
		
		
		/*	

		List<WebElement> arrayList = new ArrayList<WebElement>();
		arrayList= driver.findElements(By.tagName("a"));
		for (int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i).getAttribute("href") + arrayList.get(i).getText() );
		}
		System.out.println(arrayList.size());
		
		
	*/
		Actions act=new Actions(driver);
	
		
		Thread.sleep(3000);
		ele=driver.findElement(By.linkText("Platform"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		act.contextClick();
	
		
		Thread.sleep(5000);
		System.out.println("Done");

		
		//driver.close();
	
		
		
		
		
} 
}
