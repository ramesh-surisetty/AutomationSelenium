package com.testers.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile {

	public static String getProperty(String key)  {
		
		Properties prop = new Properties();
		String configFilePath = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
		
		FileInputStream configFile;
		
		try {
			configFile = new FileInputStream(configFilePath);
			prop.load(configFile);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
	@Test
	public void test() throws IOException {
		String URL = ReadPropertyFile.getProperty("URL");
		System.out.println("URL of app is "+ URL);
		
		System.out.println("username is :"+ReadPropertyFile.getProperty("username") );
		
	}
	
	
	
}
