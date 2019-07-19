package com.TestNG.Assign;

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

public class AmazonTestNGAssign {
	WebDriver driver = null;

	@BeforeTest
	public void getDriver() {
		System.out.println("getDriver Method1");
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@BeforeMethod
	public void beforeTestCase() {
		System.out.println("beforeTestCase1");
	}

	@Test(priority = 0)
	public void testTitle() {
		System.out.println("testTitle1");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Test(priority = 1)
	public void testTab() {
		System.out.println("testTab1");
		WebElement ele = driver.findElement(By.xpath(".//a[contains(text(),\"Today's Deals\")]"));
		String text = ele.getText();
		Assert.assertEquals(text, "Today's Deals");
	}

	@AfterMethod
	public void afterTestCase() {
		System.out.println("afterTestCase1");
	}

	@AfterTest
	public void close() {
		System.out.println("close Method1");
		driver.close();
	}

}
