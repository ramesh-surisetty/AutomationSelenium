package com.testers.tests;


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
