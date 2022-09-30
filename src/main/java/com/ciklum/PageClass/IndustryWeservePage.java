package com.ciklum.PageClass;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.ciklum.base.ProjectSpecificMethods;

public class IndustryWeservePage extends ProjectSpecificMethods {
	
	public IndustryWeservePage(RemoteWebDriver driver, ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
		
	}

	public IndustryWeservePage industryLinkClick()
	{
		click(locateElement("xpath","//a[contains(text(),'Industries we serve')]"));
		return this;
	}
	
	//bfsi link click
	
	public IndustryWeservePage bfsiLinkClick()
	{
		click(locateElement("xpath","//a[contains(text(),'BFSI')]"));
		return this;
	}
	
	public IndustryWeservePage scrollTalklabel() throws InterruptedException
	{
		//Thread.sleep(5000);
		scroll(locateElement("xpath","//span[contains(text(),'talk')]"));
		return this;
	}
	
	public IndustryWeservePage enterFirstName(String firstName)
	{
		clearAndType(locateElement("xpath","//input[@name='firstname']"),firstName);
		return this;
	}
	
	public IndustryWeservePage enterEmail(String email)
	{
		clearAndType(locateElement("xpath","//input[@type='email']"),email);
		return this;
	}
	
	
	public IndustryWeservePage enterPhone(String Phone)
	{
		clearAndType(locateElement("xpath","//input[@name='phone']"),Phone);
		return this;
	}
	
	public IndustryWeservePage selectCountry(String Country)
	{
		selectDropDownUsingText(locateElement("xpath","//select[@name='country__c']"),Country);
		return this;
	}
	
	
	public IndustryWeservePage enterCompany(String Company)
	{
		clearAndType(locateElement("xpath","//input[@name='company']"),Company);
		return this;
	}
	
	//Job title
	
	public IndustryWeservePage enterJobTitle(String JobTitle)
	{
		clearAndType(locateElement("xpath","//input[@name='jobtitle']"),JobTitle);
		return this;
	}
	
	//service of Interest 
	
	public IndustryWeservePage selectServiceOfInterest(String Service)
	{
		selectDropDownUsingText(locateElement("xpath","//select[@name='service_of_interest__contact_']"),Service);
		return this;
	}
	
	public IndustryWeservePage enterMessage(String Message)
	{
		clearAndType(locateElement("xpath","//input[@name='company']"),Message);
		return this;
	}
}
