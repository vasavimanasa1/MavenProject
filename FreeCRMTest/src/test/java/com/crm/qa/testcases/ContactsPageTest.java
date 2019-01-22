package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreateNewContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase
{
	LogInPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	String sheetName="contacts";
	

	public ContactsPageTest() throws Exception 
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
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

		
	@Test
	public void  verifyContactsPageLabelTest()
	{
	  contactsPage.verifycontactsPageLabel();
	}
	@DataProvider()
	public Object[][] getCRMTestData() throws Exception
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getCRMTestData")
	public void fillNewContactPageTest(String title,String firstname,String lastname,String company) throws Exception
	{ 
		homePage.clickOnContactsLink();
		contactsPage.createNewContact(title, firstname, lastname, company);
		
	}
	
	
	
	
	
	
}
