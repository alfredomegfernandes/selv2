package com.screenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.Screenshot;

public class AshotDemo {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/about/privacy/previous");
		
		// Screenshot screenshot = new AShot().takeScreenshot(driver);
		
		// File image =  new File("C:\\Users\\Shelendra Kumar\\eclipse-workspace\\SeleniumTraining\\AshotImages\\testFull.png");
		
		// ImageIO.write(screenshot.getImage(), "png", image);
		

	}

}
