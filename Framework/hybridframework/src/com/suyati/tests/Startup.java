package com.suyati.tests;

import java.util.concurrent.TimeUnit;

import org.junit.runner.JUnitCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.suyati.frameworkengine.ExcelLibrary;
import com.suyati.frameworkengine.ReadConfig;



public class Startup {

	/**
	 * @param args
	 */
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {		
		
		ExcelLibrary lib = new ExcelLibrary();
		ReadConfig rc = new ReadConfig();
		
		String browser = rc.getConfiguration("BROWSER");
	
		String url = rc.getConfiguration("URL");
		System.out.println(browser );
	
		if(browser.equals("firefox")){		
			System.setProperty("webdriver.gecko.driver", "E:\\Project\\Framework_SAIG\\hybridframework\\lib\\geckodriver.exe");
			driver =new FirefoxDriver();		
		}
		
		else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver","E:\\Framework\\hybridframework\\lib\\IEDriverServer.exe");		
			DesiredCapabilities cap= new DesiredCapabilities();
			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            cap.setCapability("initialBrowserUrl", url);   
            cap.setJavascriptEnabled(true);
            driver= new InternetExplorerDriver(cap);
		}
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","E:\\Framework\\hybridframework\\lib\\chromedriver.exe");
			driver = new ChromeDriver();		
		} 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JUnitCore core = new JUnitCore();
		int numOfScenarios = lib.getRowCount("Scenarios");
		System.out.println(numOfScenarios);
		for(int i=1;i<=numOfScenarios;i++){
			String execStatus=lib.getExcelData("Scenarios",i, 1);
			if(execStatus.equalsIgnoreCase("yes")){
			String scenario = lib.getExcelData("Scenarios",i,0);
				System.out.println(scenario);
				try {
					Class scenarioToRun = Class.forName("com.suyati.tests."+scenario);
					core.run(scenarioToRun);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} 
				
			}
		} 
		
		//MailProjectClass.mailsend() ;

	}
}








