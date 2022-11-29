package com.testers.constatnts;

import com.testers.utils.ReadPropertyFile;

public class FrameworkConstants {
	
	//protected static String CHROMEDRIVERPATH = "C:/Users/Ramesh/eclipse-workspace/maveen/src/test/resources/chromedriver.exe";
	//protected static String CHROMEDRIVERPATH = "C:/Users/Ramesh/eclipse-workspace/maveen/src/test/resources/chromedriver.exe";
	//protected static String CHROMEDRIVERPATH = "./src/test/resources/executables/chromedriver.exe";
	
	private static String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

	private static String URL =ReadPropertyFile.getProperty("URL");
	
	public static String getURL() {
		return URL;
	}

	public static String getCHROMEDRIVERPATH() {
		return CHROMEDRIVERPATH;
	}
}
