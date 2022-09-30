package com.ciklum.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ciklum.PageClass.CreateMainMenuPage;
import com.ciklum.PageClass.IndustryWeservePage;
import com.ciklum.base.ProjectSpecificMethods;

public class TC003_IndustryWeserveTest extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getDataProductEngineering()
	{
		testCaseName="TC003_IndustryWeServetest";
		testDescription="Industrywe Serve Page Data Entry ";
		nodes = "Industrywe Serve Page";		
	//	dataSheetName="TC001";
		category="Smoke";
		authors="Suresh";
	}
	
	@Test(dataProvider = "fetchData")
	public void productEngineeringTest(String firstName,String email, String Phone,
			String Country, String Company,String JobTitle,String Service,String Message) throws InterruptedException
	{
		
		new CreateMainMenuPage(driver,node)
		.allowCookies()
		.clickMainMenu();
		
		new IndustryWeservePage(driver,node)
		.industryLinkClick()
		.bfsiLinkClick()
		.scrollTalklabel()
		
		.enterFirstName(firstName)
		
		.enterEmail(email)
		.enterPhone(Phone)
		.selectCountry(Country)
		.enterCompany(Company)
		.enterJobTitle(JobTitle)
		.selectServiceOfInterest(Service)
		.enterMessage(Message);
		
	}
		

}
