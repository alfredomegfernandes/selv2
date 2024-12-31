package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {
	
		// open chrome b
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// open applicatio
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		// identify etxt box
		WebElement emailTextBox = driver.findElement(By.name("email"));
		// text box is displayd or not
		boolean isDisplayStatus = emailTextBox.isDisplayed();
		System.out.print(" Displayed : "+isDisplayStatus);
		// text box enabled or not
		boolean enableStatus = emailTextBox.isEnabled();
		System.out.print(" Enables : "+enableStatus);
        
		emailTextBox.sendKeys("selenium@test.com");
		
		Thread.sleep(5000);

		// get the entered value from text box.

		String enteredValue = emailTextBox.getAttribute("value");

		System.out.println("Entered value of text box is :" + enteredValue);

		// delete the value

		emailTextBox.clear();

	}

}
