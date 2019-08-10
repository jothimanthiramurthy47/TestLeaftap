package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods
{
	public ViewLead() 
	{
		//page factory code
	}
public CreateLead clickDuplicateLead() 
{
	driver.findElementByLinkText("Duplicate Lead").click();
	return new CreateLead();
}
public EditLead clickEditLead() 
{
    driver.findElementByLinkText("Edit").click();
	return new EditLead();
}
public MyLeads clickDeletelead() 
{
    driver.findElementByLinkText("Delete").click();
    return new MyLeads();
}

}
