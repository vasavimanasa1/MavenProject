package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;

public class LogInPageTest extends TestBase
{
	LogInPage loginPage;
	HomePage homePage;
	public LogInPageTest() throws Exception
	{
		super();
		
	}

	@BeforeMethod
	public void setUp() throws Exception
	{
		
		initilization();
	    loginPage=new LogInPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	@Test
	public void loginPageTitleTest()
	{
		String title=loginPage.validatePageTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}								
	@Test
	public void crmLogoImageTest()
	{
		boolean flag=loginPage.validateCRMLogo();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginTest() throws Exception
	{
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 
	}

	
}
