package com.leaftaps.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.leads.pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods
{
	@BeforeTest
	public void setData() 
	{
		excelFileName="TC002";
	}
@Test(dataProvider="fetchData")
public void runcreatelead(	String username,
 String password,
String cname,String fname,String lname)
{
	new LoginPage()
	.enterUsername(username)
	.enterPassword(password)
	.clickLogin().clickCRMSFA()
	.clickLeadstab()
	.clickCreatelead()
	.enterCompanyName(cname).enterFName(fname).enterlName(lname)
	.clickCreateLeadbutton();

}
}
