package com.ciklum.PageClass;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.ciklum.base.ProjectSpecificMethods;

public class CarrersPage extends ProjectSpecificMethods{
	
	public CarrersPage(RemoteWebDriver driver, ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}

	
	public CarrersPage clickCarrersPage()
	{
		click(locateElement("link","Careers"));
		return this;
		
	}
}
