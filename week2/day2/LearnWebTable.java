package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		//set The Driver Path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		//find table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		//All Row
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		//First Row
		WebElement firstRow = rows.get(0);
		//All columns
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));
		System.out.println(columns.size());
		System.out.println(columns.get(1).getText());
	}

}


















