package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
//		driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("test@test.com");

		
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("John@test.com");

		
	}

}
