package com.ciklum.PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.ciklum.base.ProjectSpecificMethods;


public class CreateMainMenuPage extends ProjectSpecificMethods {
	
	
	public CreateMainMenuPage(RemoteWebDriver driver, ExtentTest node)
	{
		this.driver=driver;
		this.node=node;
	}
	
	public CreateMainMenuPage allowCookies()
	{
		click(locateElement("xpath","//button[contains(text(),'Allow all')]"));
		return this;
	}
	
	public CreateMainMenuPage clickMainMenu()
	{
		click(locateElement("xpath","//a[@class='mobileTrigger']"));
		return this;
	}
	
	public ProductEngineeringPage weDolinkclick()
	{
		//Click on the WhatwedoLink 
	//	click(locateElement("xpath","(//div[@class='childTrigger'])[1]"));
		click(locateElement("link","What we do"));
		return new ProductEngineeringPage(driver,node) ;
		
	}
	
	
	/*
	 * driver.findElement(By.xpath("//button[contains(text(),'Allow all')]")).click(
	 * ); Thread.sleep(5000);
	 * driver.findElement(By.xpath("//a[@class='mobileTrigger']")).click();
	 * driver.findElement(By.xpath("(//div[@class='childTrigger'])[1]")).click();
	 * Thread.sleep(5000);
	 * driver.findElement(By.linkText("Product engineering")).click(); WebElement
	 * ele=driver.findElement(By.
	 * xpath("//h2[contains(text(),'Service launch process')]")); //
	 * Thread.sleep(2000); JavascriptExecutor js=(JavascriptExecutor)driver;
	 * js.executeScript("arguments[0].scrollIntoView();", ele); Thread.sleep(5000);
	 * driver.findElement(By.xpath("//div[contains(text(),'01. Discussion')]")).
	 * click();
	 * 
	 */
}
