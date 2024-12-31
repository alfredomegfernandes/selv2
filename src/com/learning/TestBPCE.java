package com.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestBPCE {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.banquepopulaire.fr");
		 driver.findElement(By.id("consent_prompt_submit")).click();
		 
		 hoverElement(driver, driver.findElement(By.linkText("https://www.icgauth.banquepopulaire.fr/se-connecter/sso?service=cyber")));
		 driver.findElement(By.linkText("https://www.icgauth.banquepopulaire.fr/se-connecter/sso?service=cyber")).click();
		 
	
	}
	public static void hoverElement(ChromeDriver driver, WebElement element)
	{
	    Actions builder = new Actions(driver);
	    builder.moveToElement(element).perform();
	}
}
