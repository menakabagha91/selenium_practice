import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OldID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.bankexamstoday.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement old = driver.findElement(By.id("Blog1_blog-pager-older-link"));
		old.click();
	}
}
	