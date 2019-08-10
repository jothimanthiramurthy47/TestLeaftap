package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods
{
 public CreateLead()
 {
	 //page factory code
 }
 public CreateLead enterCompanyName(String cname)
 {
     driver.findElementById("createLeadForm_companyName").sendKeys(cname);
     return this;

 }
 public CreateLead enterFName(String fname)
 {
     driver.findElementById("createLeadForm_firstName").sendKeys(fname);
     return this;
 }
 public CreateLead enterlName(String lname)
 {
     driver.findElementById("createLeadForm_lastName").sendKeys(lname);
     return this;
 }
 public ViewLead clickCreateLeadbutton()
 {
     driver.findElementByClassName("smallSubmit").click();
     return new ViewLead();
 }
	
}
