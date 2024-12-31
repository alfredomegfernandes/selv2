package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	private static String PATH = "D:\\chromedriver-win64\\chromedriver.exe";
	private static String URL  = "https://the-internet.herokuapp.com/checkboxes";
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",PATH);
		ChromeDriver driver = new ChromeDriver();
		// maximize the broswer
				driver.manage().window().maximize();

				// Open application
				// site não é igual ao que existe actualmente
				driver.get("https://www.gotomeeting.com/en-in/try");

				// identify radio button element.

				WebElement secondRadioButton = driver.findElement(By.xpath("//input[@value='10-99']"));

				// Display status

				boolean isDisplayedStatus = secondRadioButton.isDisplayed();

				System.out.println("is displayed status is :" + isDisplayedStatus);

				// Enable status

				boolean isEnableStatus = secondRadioButton.isEnabled();
				System.out.println("Is enable status is :" + isEnableStatus);

				// select a radio button

				secondRadioButton.click();
				
				Thread.sleep(5000);

				// get selected status of radio button

				boolean isSelectedStatus = secondRadioButton.isSelected();

				System.out.println("Is selected status after click :" + isSelectedStatus);

				// Un select radio button

				WebElement firstRadioButton = driver.findElement(By.xpath("//input[@value='1-9']"));

				firstRadioButton.click();

	}

}
