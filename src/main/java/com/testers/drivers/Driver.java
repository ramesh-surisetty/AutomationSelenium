package com.testers.drivers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testers.constatnts.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	public static WebDriver driver;
	static Logger log = LogManager.getLogger("Driver");

	
	public static void initDriver() {
	
			//System.setProperty("webdriver.chrome.driver", FrameworkConstants.getCHROMEDRIVERPATH());
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(FrameworkConstants.getURL());
			log.info("User launched : "+FrameworkConstants.getURL());
			
		
	}
	
	public static void quitDriver() {
	
			driver.close();
	}
}
