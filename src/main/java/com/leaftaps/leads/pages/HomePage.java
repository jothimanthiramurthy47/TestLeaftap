package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage() { // Pagefactory code
	}

	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	public MyHomePage clickCRMSFA()
	{
	       driver.findElementByLinkText("CRM/SFA").click();
	       return new MyHomePage();
	}
}
