import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownExampl1 {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\slenium_minu\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalsundaram.in/");
		driver.manage().window().maximize();
		WebElement wl = driver.findElement(By.xpath(".//p[@class='insuranceiconstext'][contains(text(),'Health')]"));
		wl.click();
		Thread.sleep(3000);
		WebElement pr = driver.findElement(By.xpath(
				".//*[@id=\"healthlandingsection\"]/div/div/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/button/a[1]"));
		pr.click();
		Thread.sleep(3000);

		 WebElement planTypeElement =
		 driver.findElement(By.xpath(".//*[@id=\"_com_rs_portlet_campaignlifeline_CampaignLifelineInsurancePortlet_calculatePremiumData-planType\"]"));
		 Select s=new Select(planTypeElement);
		 s.selectByVisibleText("Supreme");
		// s.selectByValue("Supreme");
		 //s.selectByIndex(2);

	}

}
