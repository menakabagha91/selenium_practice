import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHotStar {

	public static void main(String[] args) {
		//Include chrome specific web driver
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		
		//Send request to Chrome driver
		WebDriver d=new ChromeDriver();
		d.get("https://www.hotstar.com");
		
	}

}
