import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		//driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
