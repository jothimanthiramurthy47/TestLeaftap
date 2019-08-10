package com.leaftaps.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.leads.pages.LoginPage;

public class TC005_DeleteLead extends ProjectSpecificMethods  
{
	@BeforeTest
	public void setData() 
{
		excelFileName ="TC005";
}
	@Test(dataProvider="fetchData")
public void runDeleteLead(String uname, String pass, String cname, String fname, String lname)
{
new LoginPage().enterUsername(uname).enterPassword(pass).clickLogin()
.clickCRMSFA()
.clickLeadstab()
.clickCreatelead()
.enterCompanyName(cname).enterFName(fname).enterlName(lname).clickCreateLeadbutton()
.clickDeletelead();
}
}