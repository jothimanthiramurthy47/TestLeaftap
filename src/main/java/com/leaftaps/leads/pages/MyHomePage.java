package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods
{
	 public MyHomePage()
	{
		//pagefactory code
	}
	 public MyLeads clickLeadstab()
	 {
	       driver.findElementByLinkText("Leads").click();
	       return new MyLeads();

	 }

}
