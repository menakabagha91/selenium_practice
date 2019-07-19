package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver = null;

	@BeforeTest
	public void getDriver() {
		System.out.println("getDriver Method");
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void login() {
		WebElement login = driver.findElement(By.xpath(".//a[contains(text(),'Login & Signup')]"));
		login.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement mobile = driver.findElement(By.cssSelector(".fk-input.login-form-input.user-email"));
		mobile.sendKeys("7337052946");
		WebElement password = driver.findElement(By.cssSelector(".fk-input.login-form-input.user-pwd"));
		password.sendKeys("platinumworld");
		WebElement  login2= driver.findElement(By.cssSelector(".submit-btn.login-btn.btn"));
		login2.click();


	}
}
