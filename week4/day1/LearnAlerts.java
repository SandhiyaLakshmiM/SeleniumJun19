package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.sendKeys("Balaji");
	alert.accept();
	
	driver.findElementByXPath("//button[text()='Prompt Box']").click();
	
	
	String text = driver.findElementByTagName("h1").getText();
	System.out.println(text);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
}
