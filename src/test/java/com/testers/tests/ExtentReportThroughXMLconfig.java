package com.testers.tests;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportThroughXMLconfig {

	@Test
	public void extentReportthroughXMLConfiguration() throws IOException  {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("index1.html");
		ExtentReports extent = new ExtentReports();
		spark.loadXMLConfig(new File("./src/main/resources/extentconfig.xml"));
		
		extent.attachReporter(spark);

		ExtentTest test = extent.createTest("Test1");
		test.info("Test information");
		test.info("Test information 1");
		test.info("Test information 2");
		test.pass("passed");
		
		extent.flush();
	}
	
}
