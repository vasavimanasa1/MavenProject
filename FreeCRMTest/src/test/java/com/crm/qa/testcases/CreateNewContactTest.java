package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreateNewContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;
import com.crm.qa.util.TestUtil;

public class CreateNewContactTest extends TestBase
{
	LogInPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	CreateNewContactPage createnewcontactPage;
	
	public CreateNewContactTest() throws Exception
	{
		super();
		
	}
	@BeforeMethod
	public void setUp() throws Exception
	{
		initilization();
		testUtil=new TestUtil();
		contactsPage=new ContactsPage();
		loginPage=new LogInPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		homePage.clickOnContactsLink();
		//contactsPage.clickonNewContactbtn();
		 
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	@Test
	public void creatingNewContactinfoTest() throws Exception
	{
		
		System.out.println("This is new contact info page");
		
		createnewcontactPage.info();
		
		
	}
	
	
	
	
	
	

}
