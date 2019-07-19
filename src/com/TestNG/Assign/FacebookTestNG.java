package com.TestNG.Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTestNG {
	WebDriver driver = null;

	@BeforeTest
	public void getDriver() {
		System.out.println("getDriver Method1");
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void login() {
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("menaka.bagha@gmail.com");
		WebElement password = driver.findElement(By.xpath(".//input[@id='pass']"));
		password.sendKeys("jyosoman");
		WebElement  submit= driver.findElement(By.xpath("//input[@id='u_0_a']"));
		submit.click();


	}

}
