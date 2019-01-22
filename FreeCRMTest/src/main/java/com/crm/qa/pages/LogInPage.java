package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LogInPage extends TestBase
{
	
	//Object Repository-Page Factory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmLogo;
		
	
	public LogInPage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions....
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo()
	{
		return crmLogo.isDisplayed();
	}
	
	public  HomePage login(String un,String pwd) throws Exception
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	

}
