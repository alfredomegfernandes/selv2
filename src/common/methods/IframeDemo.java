package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// open application
		driver.get("https://jqueryui.com/dialog");
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Close']")).click();
	}

}
