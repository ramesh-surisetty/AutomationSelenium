package com.testers.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void initReports() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports/RaviReport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Report Rav");
	}
	
	public static void flushReports() {
		
		extent.flush();
		try {
			Desktop.getDesktop().browse(new File("ExtentReports/RaviReport.html").toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createTestReport(String testname) {
		test = extent.createTest(testname);
	}
	
	public static void createstepinfo(String methodname) {
		test.info(methodname);
	}
	
	public static void createtestpass(String testname) {
		test.pass(testname);
	}
	
	public static void createtestfail(String testname) {
		test.fail(testname);
	}
	
	
}
