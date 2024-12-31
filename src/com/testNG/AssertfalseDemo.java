package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertfalseDemo {

	@Test
	public void checkIfAllCheckBoxIsSelected() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		// enter username

		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		// click on login button
		driver.findElement(By.name("Submit")).click();
		
		// Click on Leave button
		
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		
		
boolean isAllCheckBoxSelectedStatus =		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).isSelected();
		
		
Assert.assertFalse(isAllCheckBoxSelectedStatus)		;

	}

}
