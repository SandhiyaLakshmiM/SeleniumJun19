package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.findElementByLinkText("Contact Us").click();
	System.out.println(driver.getTitle());
//	String windowHandle = driver.getWindowHandle();
	
	Set<String> allWindows = driver.getWindowHandles();
	List<String> listWindows = new ArrayList<String>();
	listWindows.addAll(allWindows);
	driver.switchTo().window(listWindows.get(1));
	
	
	System.out.println(driver.getTitle());
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File target = new File("./snaps/Img001.jpg");
	FileUtils.copyFile(src, target);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
