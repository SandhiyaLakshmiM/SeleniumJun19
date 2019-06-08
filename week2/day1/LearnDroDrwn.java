package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDroDrwn {

	public static void main(String[] args) throws InterruptedException {
		//set The Driver Path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch chrome
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leafground.com/pages/Dropdown.html");
		//maximize the Browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElementById("dropdown1");

		
		Select dd = new Select(ele);
		//dd.selectByVisibleText("Appium");
		//dd.selectByIndex(3);
		dd.selectByValue("4");
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		String text = allOptions.get(size-1).getText();
		System.out.println(text);
		
		
		/*
		driver.findElementByXPath("//input[@type ='password']");
		
		ele.sendKeys("600100", Keys.TAB);
		Thread.sleep(2000);
		*/
		
		
		
		/*for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
