package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AUIDragAndDrop {

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
		driver.get("http://leafground.com/pages/drop.html");
		WebElement source = driver.findElementById("draggable");
		WebElement target = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		
	}

}









