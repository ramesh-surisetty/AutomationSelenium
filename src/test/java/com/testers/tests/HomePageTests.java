package com.testers.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.testers.drivers.Driver;


public class HomePageTests extends BaseTests {
	
	@Test
	public void test3() {
		
		Driver.driver.findElement(By.name("q")).sendKeys("Ravi",Keys.ENTER);
	}
	
	@Test
	public void test4() {
		
		Driver.driver.findElement(By.name("q")).sendKeys("Rupesh",Keys.ENTER);
	}
}
