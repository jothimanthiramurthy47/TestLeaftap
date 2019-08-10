package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods
{
public EditLead()
{
	//Page factory code
}
	
public  EditLead enterCompanyName(String companyname )
{
	driver.findElementById("updateLeadForm_companyName").clear();
    driver.findElementById("updateLeadForm_companyName").sendKeys(companyname); 
	return this;
}
public ViewLead clickUpdate()
{
	driver.findElementByXPath("//input[@class='smallSubmit'][1]").click();
    return new ViewLead();
}

}
