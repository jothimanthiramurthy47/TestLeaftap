package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods
{
	public MyLeads()
	{
		//page factory code
	}
	
	public CreateLead clickCreatelead()
	{
	       driver.findElementByLinkText("Create Lead").click();
	       return new CreateLead();

	}

}
