package com.ciklum.PageClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.ciklum.base.ProjectSpecificMethods;

public class ProductEngineeringPage  extends ProjectSpecificMethods{
	
	public ProductEngineeringPage(RemoteWebDriver driver, ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	
	public ProductEngineeringPage producPageClick()
	{
		click(locateElement("link","Product engineering"));
		return this;
	}
	
	

	public ProductEngineeringPage  productPlatformEnginnering() 
	{
		//for Scroll 
		scroll(locateElement("xpath","//span[contains(text(),'help')]"));
		click(locateElement("link","Product & platform engineering"));
		return this ;
	}
	
	public ProductEngineeringPage productDiscussionTab() throws InterruptedException 
	{
		Thread.sleep(5000);
		scroll(locateElement("xpath","//h2[contains(text(),'Service launch process')]"));
		click(locateElement("xpath","//div[contains(text(),'01. Discussion')]"));
		return this ;
	
	/*JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView();", ele);*/
}
	
	public ProductEngineeringPage productDiscoveryTab() 
	{
		
		click(locateElement("xpath","//div[contains(text(),' 02. Discovery')]"));
		return this;
		
	}
	
	public ProductEngineeringPage productmobilisationTab() 
	{
		
		click(locateElement("xpath","//div[contains(text(),' 03. Mobilisation')]"));
		return this;
	}

	public ProductEngineeringPage productContinousDeliveryTab() 
	{
		
		click(locateElement("xpath","//div[contains(text(),' 04. Continuous discovery and continuous delivery')]"));
		return this;
	}
}