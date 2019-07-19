package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetTitleTest {
	WebDriver driver = null;

	@BeforeTest
	public void getDriver() {
		System.out.println("getDriver Method");
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
	}

	@BeforeMethod
	public void beforeTestCase() {
		System.out.println("beforeTestCase");
	}

	@Test(priority = 0)
	public void testTitle() {
		System.out.println("testTitle");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}

	@Test(priority = 1)
	public void testTab() {
		System.out.println("testTab");
		WebElement ele = driver.findElement(By.xpath(".//a[contains(text(),'New Tours')]"));
		String text = ele.getText();
		Assert.assertEquals(text, "New Tours");
	}

	@AfterMethod
	public void afterTestCase() {
		System.out.println("afterTestCase");
	}

	@AfterTest
	public void close() {
		System.out.println("close Method");
		driver.close();
	}
}
