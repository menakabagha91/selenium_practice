import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTest {

	public static void main(String[] args) {
		// Include chrome specific web driver
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");

		// Send request to Chrome driver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement wl = driver.findElement(By.xpath(".//*[@id=\"nav-cart\"]"));
		wl.click();

	}

}
