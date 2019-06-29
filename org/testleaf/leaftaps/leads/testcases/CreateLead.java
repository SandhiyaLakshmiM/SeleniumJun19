package org.testleaf.leaftaps.leads.testcases;

import org.testleaf.leaftaps.seleniumbase.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{
//	@Test(invocationCount=2)
	@Test
	public void runCreateLead() {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
}
}






