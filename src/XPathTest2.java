import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com");
		driver.manage().window().maximize(); 
		WebElement we = driver.findElement(By.xpath(".//a[@class='nav-link'][contains(text(),'News')]"));
		we.click();


	}

}
