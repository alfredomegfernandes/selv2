package common.methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// maximize 
		driver.manage().window().maximize();
		
		// open icici home page
		driver.get("https://www.icicibank.com/");
		
		// Click on Later button of pop up 
		
		driver.findElement(By.id("push-modal-close")).click();
		
		//Click on LOgin button 
		
		driver.findElement(By.linkText("LOGIN")).click();
		
		// get the window id of 1st tab. 
		
	String firstTabWindowID =	driver.getWindowHandle();
	System.out.println("First tab window id is :"+firstTabWindowID);
		
		
		// Click on About US link 
		
		driver.findElement(By.linkText("About Us")).click();
		
		// switch focus from 1st tab to 2nd tab 
		
		
	Set <String> allWindowIds = 	driver.getWindowHandles();
	
	for (String s :allWindowIds) {
		
		if(!s.equals(firstTabWindowID)) {
			
			driver.switchTo().window(s);
		}
		
	}
		
		
		// Click on History link 
		
		driver.findElement(By.linkText("History")).click();
		
		// switch focus from 2nd tab to first tab. 
		
		driver.switchTo().window(firstTabWindowID);
		
		
		// enter value in search text box.
		
		driver.switchTo().frame("Revamp_Banner_ID");
		
		driver.findElement(By.id("Search")).sendKeys("test");
		
		
		
	
	}

}
