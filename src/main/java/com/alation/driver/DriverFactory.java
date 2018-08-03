package com.alation.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class DriverFactory {
	
	protected static WebDriver driver;


	public void driverFactory() {
		System.setProperty("webdriver.chrome.driver", "E:\\Testleaf\\Workspace\\Alation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
}
