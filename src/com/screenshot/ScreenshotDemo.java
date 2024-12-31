package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// open login page

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// take screenshot
		captureScreenshot(driver, "loginPage");

		// enter username

	//	driver.findElement(By.name("username")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[text()='username']")).sendKeys("Admin");
		
		// takescreenshot
	//	captureScreenshot(driver, "username");

		// enter password

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		// take screenshot
		captureScreenshot(driver, "password");

		// click on login button
		driver.findElement(By.name("Submit")).click();

		// take screenshot

		captureScreenshot(driver, "homepage");
 
		driver.close();

	}

	public static void captureScreenshot(ChromeDriver driver, String fileName) {
		TakesScreenshot screenshot = driver;

		File image = screenshot.getScreenshotAs(OutputType.FILE);
		File myFile = new File("D:\\eclipse-workspace\\SeleniumTrining\\screenshots\\"+fileName+".png");

		// copy
		try {
			FileUtils.copyFile(image, myFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	
	}

};