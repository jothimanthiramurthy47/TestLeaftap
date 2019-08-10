package com.leaftaps.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.leads.pages.LoginPage;

public class TC004_DuplicateLead extends ProjectSpecificMethods
{
@BeforeTest
public void setData()
{
	excelFileName="TC004";
}
@Test(dataProvider="fetchData")
public void runDuplicatelead(String uname,String pass, String cname, String fname, String lname, String dname)
{
	new LoginPage().enterUsername(uname).enterPassword(pass).clickLogin()
	.clickCRMSFA()
	.clickLeadstab()
	.clickCreatelead()
	.enterCompanyName(cname).enterFName(fname).enterlName(lname).clickCreateLeadbutton()
	.clickDuplicateLead().enterCompanyName(dname).clickCreateLeadbutton();
}
}
