package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		//set The Driver Path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch chrome
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leafground.com/pages/Link.html");
		//maximize the Browser 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allLinks = driver.findElementsByTagName("a");
		
		WebElement first = allLinks.get(1);
		System.out.println(first.getText());
		int size = allLinks.size();
		
		String text = allLinks.get(size-1).getText();
		System.out.println(text);
		
		

	}

}
