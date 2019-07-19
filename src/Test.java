import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		
		WebElement pr = driver.findElement(By.xpath(
				".//*[@id=\"pane-side\"]/div[1]/div/div/div[3]/div/div/div[2]/div[1]/div[1]/span/span"));
		pr.click();
	}

}
