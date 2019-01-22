package com.crm.qa.testcases;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LogInPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase
{
	LogInPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;

	public HomePageTest() throws Exception 
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
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void homePageTitleTest()
	{
		String homePageTitle= homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"CRMPRO");
	}
	
	@Test
	public void correctUserTest()
	{
		testUtil.switchToFrame();
		Assert.assertTrue((homePage.correctUserNamelabel()));
	}
	
	@Test
	public void clickOnContactsLinkTest() throws Exception
	{
		testUtil.switchToFrame();
		contactsPage=homePage.clickOnContactsLink();
		
			
	}
	

}
