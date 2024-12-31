package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	private static String PATH = "D:\\chromedriver-win64\\chromedriver.exe";
	private static String URL  = "https://the-internet.herokuapp.com/checkboxes";
	private static String CHECKBOX1_PATH = "//form[@id='checkboxes']/input[1]";
	private static String CHECKBOX2_PATH = "//form[@id='checkboxes']/input[2]";
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",PATH);
		ChromeDriver driver = new ChromeDriver();
		
		// open application 
		driver.get(URL);
		// IDENTIFY CHECK BOX
		WebElement checkBox1 = driver.findElement(By.xpath(CHECKBOX1_PATH));
		WebElement checkBox2 = driver.findElement(By.xpath(CHECKBOX2_PATH));
		checkBox1.click();
		Thread.sleep(2000);
		checkBox2.click();
		
	
	}

}
