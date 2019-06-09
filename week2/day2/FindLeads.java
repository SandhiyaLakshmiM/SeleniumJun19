package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindLeads {

	public static void main(String[] args) throws InterruptedException {
		//set The Driver Path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch chrome
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the Browser 
		driver.manage().window().maximize();
		//login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(5000);
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("(//a[@class='linktext'])[4]")));
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

	}

}









