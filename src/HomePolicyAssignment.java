import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePolicyAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalsundaram.in");
		driver.manage().window().maximize();
		WebElement we = driver.findElement(By.xpath(".//*[@id=\"carousel-selector-3\"]/p"));
		we.click();
		Thread.sleep(3000);
		WebElement ha = driver.findElement(By.xpath(".//button[@class='btn btn-default btnwritetous margin-top-15 width100 border-white hhdata_know'] "));
		ha.click();
		Thread.sleep(3000);
		WebElement hb = driver.findElement(By.xpath(".//a[contains(text(),'Home Building')] "));
		hb.click();
		Thread.sleep(3000);
		WebElement tsfa=driver.findElement(By.xpath(".//*[@id=\"_com_rs_portlet_homeinsurance_HomeBuildingPortlet_homeProduct-homeShield-sqftAreaBuilt\"]"));
		tsfa.sendKeys("3000");
		Thread.sleep(5000);
		WebElement mobno=driver.findElement(By.xpath(".//*[@id=\"_com_rs_portlet_homeinsurance_HomeBuildingPortlet_proposer-mobileNumber\"]"));
		mobno.sendKeys("9435672095");
		Thread.sleep(3000);
		WebElement getQuote=driver.findElement(By.xpath(".//form[@id='_com_rs_portlet_homeinsurance_HomeBuildingPortlet_homeBuildingFm']//button[@id='_com_rs_portlet_homeinsurance_HomeBuildingPortlet_customscroll']"));
		getQuote.click();
		Thread.sleep(3000);
		WebElement discount=driver.findElement(By.xpath(".//*[@id=\"toggle_event_editing_discount_Yes\"]"));
		discount.click();
		Thread.sleep(5000);
		WebElement period= driver.findElement(By.xpath(".//*[@id=\"_com_rs_portlet_homeinsurance_BuildingTransactionPortlet_homeProduct-homeShield-periodOfInsurance\"]"));
		Select s=new Select(period);
		s.selectByVisibleText("5 Years");
		Thread.sleep(2000);
		WebElement costofconst =driver.findElement(By.xpath(".//*[@id=\"_com_rs_portlet_homeinsurance_BuildingTransactionPortlet_homeProduct-homeShield-costOfConstruction\"]"));
		costofconst.sendKeys("4675");
		Thread.sleep(3000);
		WebElement next=driver.findElement(By.xpath(".//*[@id=\"_com_rs_portlet_homeinsurance_BuildingTransactionPortlet_kgtq\"]"));
		next.click();
		
		
		
	}
}
