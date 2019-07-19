package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SessionHandlingTest {

	@BeforeTest
	public void getDriver() {
		System.out.println("getDriver Method");
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
	}

	@Test
	public void testTitle() {
		System.out.println("testTitle");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}

	@Test
	public void testTab() {
		System.out.println("testTab");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement ele = driver.findElement(By.xpath(".//a[contains(text(),'New Tours')]"));
		String text = ele.getText();
		Assert.assertEquals(text, "New Tours");
	}

}
