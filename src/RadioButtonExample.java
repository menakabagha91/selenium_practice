import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement fst = driver.findElement(By.xpath(". //input[@id='vfb-7-1']"));
		fst.click();
		Thread.sleep( 3000);
		WebElement sec = driver.findElement(By.xpath(". //input[@id='vfb-7-2']"));
		sec.click();
		Thread.sleep( 3000);
		WebElement trd = driver.findElement(By.xpath(".//input[@id='vfb-7-3'] "));
		trd.click();
	}
}
