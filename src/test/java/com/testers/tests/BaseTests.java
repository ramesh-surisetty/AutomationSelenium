package com.testers.tests;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.testers.drivers.Driver;

public class BaseTests {
	
	@BeforeMethod
	public void setUP() {
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		//Driver.quitDriver();
	}
	
	public void staticwait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
