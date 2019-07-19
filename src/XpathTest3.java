import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement we = driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']"));
		we.sendKeys("sunsilk shampoo");
		WebElement searchIcon = driver
				.findElement(By.xpath(".//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
		searchIcon.click();
	}

}
