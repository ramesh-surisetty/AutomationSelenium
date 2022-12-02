package com.testers.tests;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.testers.drivers.Driver;
import com.testers.reports.ExtentReport;

public class BaseTests {
	
	//public static ExtentReports extent;
	//public static ExtentTest test;
	
	@BeforeMethod
	public void setUP() {
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}
	
	public void staticwait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeSuite
	public void initReports() {
		
		ExtentReport.initReports();
		
	}
	
	@AfterSuite
	public void flushReports() {
		
		ExtentReport.flushReports();
	}
	
	/*
	public static void createTestReport(String testcasename) {
		test = extent.createTest(testcasename);
	}
	*/
	
}
