import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		WebElement first=driver.findElement(By.xpath(".//*[@id=\"firstName\"]"));
		first.sendKeys("Waltson");
		WebElement second=driver.findElement(By.xpath(".//*[@id=\"lastName\"]"));
		second.sendKeys("Cruse");
		WebElement username=driver.findElement(By.xpath(".//*[@id=\"username\"]"));
		username.sendKeys("crusewaltson811");
		WebElement password=driver.findElement(By.xpath(".//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
		password.sendKeys("platinumworld");
		WebElement conform=driver.findElement(By.xpath(".//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
		conform.sendKeys("platinumworld");
		WebElement next = driver.findElement(By.xpath(".//*[@id=\"accountDetailsNext\"]/span/span "));
		next.click();


	}

}
