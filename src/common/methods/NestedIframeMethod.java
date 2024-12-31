package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// open application
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		// sw to iframe 
		driver.switchTo().frame("frame-top");
		// from par to child 
		driver.switchTo().frame("frame-middle");
		// ident eleme
		WebElement wel = driver.findElement(By.id("content"));		
		System.out.println("ccc "+wel.getText());	
		// from child to parent 
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
	}

}
