package com.testers.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testers.pages.basePages;
import com.testers.reports.ExtentReport;

public final class ListenerClass implements ITestListener ,ISuiteListener{

	Logger log = LogManager.getLogger("FrameworkLogs");
	
	public void onStart(ISuite suite) {
		
		
	}
	
	public void onFinish(ISuite suite) {
		
	}

	public void onTestStart(ITestResult result) {

		log.info("Test Started : "+ result.getMethod().getMethodName());
		
		ExtentReport.createTestReport(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		log.info("Test Passed : "+ result.getMethod().getMethodName());
		
		ExtentReport.createtestpass(result.getMethod().getMethodName());

	}

	public void onTestFailure(ITestResult result) {
		
		log.info("Test Failed : "+ result.getMethod().getMethodName());
		
		basePages.takeScreenshot(result.getMethod().getMethodName());
		
		ExtentReport.createtestfail(result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
}
