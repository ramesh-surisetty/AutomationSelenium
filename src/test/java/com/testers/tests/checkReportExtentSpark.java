package com.testers.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class checkReportExtentSpark {

	@Test
	
	public void omayostandaloneReport() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Report Rav");
		
		
		ExtentTest test = extent.createTest("Test1");
		test.info("Test information");
		test.info("Test information 1");
		test.info("Test information 2");
		test.pass("passed");
		test.fail("test failed");

		ExtentTest test2 = extent.createTest("Test 2");
		test2.info("Test2 information");
		test2.info("Test2 information 1");
		test2.info("Test2 information 2");
		
		test2.fail("test failed");
		test2.pass("passed");
		
		ExtentTest test3=extent.createTest("Test 3");
		test3.info("Test2 information");
		test3.info("Test2 information 1");
		test3.info("Test2 information 2");
		
		test3.pass("passed");
		
		extent.flush();
		
	}
	
}
