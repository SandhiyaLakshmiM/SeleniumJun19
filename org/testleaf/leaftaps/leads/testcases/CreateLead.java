package org.testleaf.leaftaps.leads.testcases;

import java.io.IOException;

import org.testleaf.leaftaps.seleniumbase.ProjectSpecificMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;

public class CreateLead extends ProjectSpecificMethods{
	@BeforeClass
	public void setData() {
		excelFileName = "CreateLead";
	}
	//	@Test(invocationCount=2)
	@Test(dataProvider="fetchData")
	public void runCreateLead(String cName, String fName, String lName) {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		/*String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1]= "Haja";
		data[0][2] = "M";
		
		data[1][0] = "TestLeaf";
		data[1][1]= "Balaji";
		data[1][2] = "P";
		return data;*/
	//	ReadExcel readExcel = new ReadExcel();
		return ReadExcel.readExcelData("CreateLead");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






