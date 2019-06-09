package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		//set The Driver Path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch chrome
		ChromeDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait
		(30, TimeUnit.SECONDS);
		//maximize the Browser 
		driver.manage().window().maximize();
		//login
		driver.get("https://www.flipkart.com");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		
		// AUI
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement apple = driver.findElementByLinkText("Apple");
		wait.until(ExpectedConditions.visibilityOf(apple));
		apple.click();
	}

}









