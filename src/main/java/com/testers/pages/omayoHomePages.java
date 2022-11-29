package com.testers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.testers.drivers.Driver;

public class omayoHomePages extends basePages{
	
	By omayousername = By.xpath("(//form/input[@type='text'])[1]");
	By omayopassword =By.xpath("(//form/input[@type='password'])[1]");
	
	public void provideUsernameAndPassword() {
		
		click(omayousername);
		enterField(omayousername,"omayologin");
		
		click(omayopassword);
		enterField(omayopassword,"omayopwd");
		
	}
	
	public void scrollToUserName() {
		
		JavascriptExecutor js =(JavascriptExecutor)Driver.driver;
		
		//js.executeScript(js script,Argument);
		
		WebElement omayouname =Driver.driver.findElement(omayousername);
		scrolltoEltToDown(omayouname);
		log.info("Scrolled till element visible at bottom");
		staticwait(3000);
		scrolltoEltTop(omayouname);
		log.info("Scrolled till element visible at top");

		staticwait(3000);
		pageScrollDown();
	}
	
	public void enterDataUsingJavaScriptExecutor() {
		
		WebElement omayouname =Driver.driver.findElement(omayousername);
		WebElement omayopwd =Driver.driver.findElement(omayopassword);
		
		EnterUsingJS(omayouname,"useranme");
		EnterUsingJS(omayopwd,"password");


	}
	
}
