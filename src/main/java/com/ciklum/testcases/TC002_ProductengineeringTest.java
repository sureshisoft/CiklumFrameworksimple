package com.ciklum.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ciklum.PageClass.CreateMainMenuPage;
import com.ciklum.PageClass.ProductEngineeringPage;
import com.ciklum.base.ProjectSpecificMethods;

public class TC002_ProductengineeringTest extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getDataProductEngineering()
	{
		testCaseName="TC003_Productengineering";
		testDescription="Product Enginnering Page Data ";
		nodes = "Product Engineering Page ";		
	//	dataSheetName="TC001";
		category="Smoke";
		authors="Suresh";
	}
	
	@Test
	public void productEngineeringTest() throws InterruptedException
	{
		
		new CreateMainMenuPage(driver,node)
		.allowCookies()
		.clickMainMenu()
		 .weDolinkclick();
		
		new ProductEngineeringPage(driver,node)
		
		.producPageClick()
		.productPlatformEnginnering()
		.productDiscussionTab()
		.productDiscoveryTab()
		.productmobilisationTab()
		.productContinousDeliveryTab();
	}

}
