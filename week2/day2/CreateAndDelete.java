package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDelete {

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
		driver.findElementByLinkText("Create Lead").click();

		// Create Lead
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sarath");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		driver.findElementByName("submitButton").click();

		// Get the Lead Id
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		String leadId = text.replaceAll("\\D", "");		
		// Delete the Lead
		driver.findElementByLinkText("Delete").click();		
		// Confirm it is deleted
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
//		Thread.sleep(5000);		
		boolean displayed = driver.
				findElementByXPath("//div[text()='No records to display']")
				.isDisplayed();
		
		System.out.println(displayed);

	}

}
