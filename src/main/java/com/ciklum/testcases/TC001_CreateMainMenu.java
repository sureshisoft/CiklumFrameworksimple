package com.ciklum.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ciklum.PageClass.CreateMainMenuPage;
import com.ciklum.base.ProjectSpecificMethods;

public class TC001_CreateMainMenu extends ProjectSpecificMethods {

	@BeforeTest
	public void getDataMenu()
	{
		testCaseName="TC001_CreateMainMenu";
		testDescription="Click on the Main Menu link ";
		nodes = "Main Menu";		
	//	dataSheetName="TC001";
		category="Smoke";
		authors="Suresh";
	}
	
	@Test
	public void menuClickTestcase()
	{
		new CreateMainMenuPage(driver,node)
		.allowCookies()
		.clickMainMenu()
		 .weDolinkclick();
		
	}
}
