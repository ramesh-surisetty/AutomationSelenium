package com.testers.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.testers.drivers.Driver;

public class basePages {
	
	public Logger log = LogManager.getLogger("LoginPageTests");


	protected void click(By by) {
		Driver.driver.findElement(by).click();
	}
	
	protected void enterField(By by, String data) {
		Driver.driver.findElement(by).sendKeys(data);;
	}
	
	protected void pageScrollDown() {
		JavascriptExecutor js =(JavascriptExecutor)Driver.driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	protected void pageScrollUp() {
		JavascriptExecutor js =(JavascriptExecutor)Driver.driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
	
	protected void scrolltoEltTop(WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)Driver.driver;
		js.executeScript( "arguments[0].scrollIntoView(true);", ele);
	}
	
	protected void scrolltoEltToDown(WebElement ele) {
		JavascriptExecutor js =(JavascriptExecutor)Driver.driver;
		js.executeScript( "arguments[0].scrollIntoView(false);", ele);
	}
	
	public void staticwait(long timeInms) {
		try {
			Thread.sleep(timeInms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected void ClickUsingJS(WebElement ele){
		JavascriptExecutor js =(JavascriptExecutor)Driver.driver;
		js.executeScript( "arguments[0].click();", ele);
	}
	
	protected void EnterUsingJS(WebElement ele, String text){
		JavascriptExecutor js =(JavascriptExecutor)Driver.driver;
		//js.executeScript( "arguments[0].value='Hello'", ele);
		js.executeScript( "arguments[0].click();", ele);
		js.executeScript( "arguments[0].value=arguments[1]", ele, text);
	}
	
	public static void takeScreenshot() {
		
		TakesScreenshot tk = (TakesScreenshot)Driver.driver;
		
		File src =tk.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir")+"/Screenshots/img1.png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
