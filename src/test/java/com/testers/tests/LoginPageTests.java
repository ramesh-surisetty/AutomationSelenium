package com.testers.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testers.drivers.Driver;
import com.testers.pages.AdactinLoginPage;
import com.testers.pages.searchHotelPage;


public class LoginPageTests extends BaseTests {
	
	Logger log = LogManager.getLogger("LoginPageTests");
	
	@Test
	public void test1() {
		
		AdactinLoginPage login= new AdactinLoginPage();
		
		login.provideUserName();
		log.info("Provided Username");
		login.providepassword();
		login.ClickOnLoginButton();
		log.info("User Logged in Success");
		
		staticwait(3000);
		String title =Driver.driver.getTitle();
		Assert.assertEquals(title, "Adactin.com - Search Hotel");
		staticwait(2000);
	}
	
	@Test
	public void test2() {
		
		AdactinLoginPage loginPage= new AdactinLoginPage();
		loginPage.provideUserName().providepassword().ClickOnLoginButton();
			
		staticwait(3000);
		String userLoggedIn =Driver.driver.findElement(By.xpath("//input[@id='username_show']")).getAttribute("value");
		Assert.assertEquals(userLoggedIn, "Hello rupeshbaba!");
		staticwait(2000);
		
	}

}
