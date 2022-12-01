package com.testers.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testers.pages.omayoHomePages;

public class omayoHomeTests extends BaseTests{
	
	Logger log = LogManager.getLogger("LoginPageTests");
	
	@Test
	public void omayoTest1() {
		
		createTestReport("omayoTest1");
		omayoHomePages omayoPage= new omayoHomePages();
		omayoPage.provideUsernameAndPassword();
		log.info("Username and password provided");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void omayoTest2() {
		
		createTestReport("omayoTest2");
		omayoHomePages omayoPage= new omayoHomePages();
		omayoPage.scrollToUserName();
		log.info("SCROLELD TILL Username ");
		Assert.assertTrue(false);

		
	}
	@Test
	public void JSText() {
		
		createTestReport("JSText");
		omayoHomePages omayoPage= new omayoHomePages();
		omayoPage.enterDataUsingJavaScriptExecutor();
	}

}
