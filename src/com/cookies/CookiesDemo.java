package com.cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		Set <Cookie> allCookies = driver.manage().getCookies();
		for(Cookie ck:allCookies) {
			System.out.println(ck.getName()+" === "+ck.getDomain()+" === "+ck.getExpiry());
		}
		
	}

}
