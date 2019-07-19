import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccidentalCaseAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalsundaram.in");
		driver.manage().window().maximize();
		WebElement we = driver.findElement(By.xpath(".//*[@id=\"carousel-selector-5\"]/p"));
		we.click();

		Thread.sleep(5000);
		WebElement name = driver.findElement(
				By.xpath(".//*[@id=\"_com_rs_portlet_personalaccident_PersonalAccidentPortlet_strFirstName\"]"));
		name.sendKeys("Menaka Bagha");

		Thread.sleep(3000);
		WebElement mobileNo = driver.findElement(
				By.xpath(".//*[@id=\"_com_rs_portlet_personalaccident_PersonalAccidentPortlet_strMobileNo\"]"));
		mobileNo.sendKeys("9773546825");

		Thread.sleep(3000);
		WebElement emailId = driver.findElement(
				By.xpath(".//*[@id=\"_com_rs_portlet_personalaccident_PersonalAccidentPortlet_strEmail\"]"));
		emailId.sendKeys("menaka.bagha@gmail.com");

		// Thread.sleep(3000);
		// WebElement yb =
		// driver.findElement(By.xpath(".//*[@id=\"toggle_event_editing1\"]/button[1]"));
		// yb.click();

		Thread.sleep(3000);
		WebElement quote = driver
				.findElement(By.xpath(".//span[@class='lfr-btn-label'][contains(text(),'Get Quote')]"));
		quote.click();

		Thread.sleep(3000);
		WebElement annualincom = driver
				.findElement(By.xpath(".//*[@id=\"_com_rs_portlet_patransaction_PATransactionPortlet_income\"]"));
		Select s = new Select(annualincom);
		s.selectByVisibleText("3-4 Lakhs");

		Thread.sleep(3000);
		WebElement membersinsured = driver.findElement(
				By.xpath(".//select[@id='_com_rs_portlet_patransaction_PATransactionPortlet_noOfPersons']"));
		Select x = new Select(membersinsured);
		x.selectByVisibleText("Self + Spouse");

		Thread.sleep(3000);
		WebElement quote2 = driver
				.findElement(By.xpath(".//span[@class='lfr-btn-label'][contains(text(),'Get Quote')]"));
		quote2.click();
		
	}

}
