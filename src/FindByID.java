import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		//WebElement but = driver.findElement(By.xpath(".//input[@id='yes']"));
		WebElement but = driver.findElement(By.id("yes"));
		if (but.isSelected()) {
			System.out.println("Checkbox already selected");
		} else {
			but.click();
		}

	}

}
