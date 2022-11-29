package com.testers.pages;

import org.openqa.selenium.By;

import com.testers.drivers.Driver;

public class AdactinLoginPage extends basePages{
	
	private By username = By.id("username");
	private By password = By.id("password");
	private By LoginButton = By.xpath("//input[@id='login']");
	
	public AdactinLoginPage provideUserName() {
		
		click(username);
		enterField(username,"rupeshbaba");
		return new AdactinLoginPage();
	}
	
	public AdactinLoginPage providepassword() {
		Driver.driver.findElement(password).click();
		Driver.driver.findElement(password).sendKeys("rupeshbaba");
		return new AdactinLoginPage();
	}
	
	public searchHotelPage ClickOnLoginButton() {
		Driver.driver.findElement(LoginButton).click();
		return new searchHotelPage();
	}
}
