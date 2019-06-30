package org.testleaf.leaftaps.leads.testcases;

import java.io.IOException;

import org.testleaf.leaftaps.seleniumbase.ProjectSpecificMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class EditLead extends ProjectSpecificMethods {
	
	@BeforeClass
	public void setData() {
		excelFileName ="EditLead";
	}
	
	@Test(dataProvider="fetchData")
	public void runEditLead(String phoneNumber, String companyName) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNumber);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(companyName);
		driver.findElementByName("submitButton").click();
		driver.close();
	}
	
}





















