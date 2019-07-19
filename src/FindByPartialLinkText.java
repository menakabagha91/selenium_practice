import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement but = driver.findElement(By.partialLinkText("Can"));
		but.click();

	}
}
