package com.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkOperationDemo {

	private static String PATH = "D:\\chromedriver-win64\\chromedriver.exe";
	private static String URL  = "https://www.facebook.com/";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",PATH);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// open application 
		driver.get(URL);
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement bt = driver.findElement(By.linkText("Permitir todos os cookies"));
		 bt.click();
		// identify link 
		WebElement link = driver.findElement(By.linkText("Não sabes a tua palavra-passe?"));
		// display status of the link 
		boolean isDisplayStatus = link.isDisplayed();
		// enable status
		
		// get the link name
		String linkName = link.getText();
		System.out.print(" name of link; "+linkName);
		// link.click();
	}

}
