import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathTest4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement category = driver.findElement(By.xpath(".//a[@id='nav-link-shopall']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(category).perform();

		Thread.sleep(3000);

		WebElement we = driver.findElement(By.xpath(
				".//div[@id='nav-flyout-shopAll']//div[contains(@class,'nav-template nav-flyout-content nav-tpl-itemList')]//a[1]"));
		we.click();
	}
}
