package com.testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTextCase {

	@Test
	public void testGoogleLaunch() {
		// open chrome b
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// open applicatio
		driver.get("https://www.google.com");

	}

}
