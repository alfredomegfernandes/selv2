package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Open application
		driver.get("https://www.goibibo.com/flights/");

		// select a date

		WebElement depcalIcon = driver.findElement(By.xpath("//input[@id='departureCalendar']/preceding-sibling::i"));

		depcalIcon.click();

		Thread.sleep(5000);

		WebElement todayDate = driver.findElement(By.xpath("//div[contains(@class,'today')]"));

		todayDate.click();

		WebElement returnCalIcon = driver.findElement(By.xpath("//input[@id=\"returnCalendar\"]/preceding-sibling::i"));

		returnCalIcon.click();

		WebElement nextMonthBtn = driver.findElement(By.xpath("//span[@role='button']"));

		nextMonthBtn.click();
		
		Thread.sleep(5000);

		WebElement firstMarchDate = driver.findElement(By.xpath("//div[@aria-label='Mon Mar 01 2021']"));

		firstMarchDate.click();

	}


}
