package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValidationDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		// open application

		driver.get("http://the-internet.herokuapp.com/forgot_password");

		// identify element\

		WebElement button = driver.findElement(By.id("form_submit"));

		// css validation

		String borderStyle = button.getCssValue("border-style");

		System.out.println("borderStyle value is :" + borderStyle);

		String textAlingn = button.getCssValue("text-align");
		System.out.println("textAlingn value is :" + textAlingn);

		String backgroundColor = button.getCssValue("background-color");
		System.out.println("back ground color code is :" + backgroundColor);

	}
}
