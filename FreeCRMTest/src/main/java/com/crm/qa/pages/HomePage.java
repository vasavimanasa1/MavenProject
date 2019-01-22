package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase 
{
	//OR-Homepage Elements
	@FindBy(xpath="//td[contains(text(),'User: manasakrishna thallapaka')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newContactLink;
		
	
	//Constructor
	public HomePage() throws Exception
	{
		PageFactory.initElements(driver, this);
	
	}
	
	// Actions
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean correctUserNamelabel()
	{
		return userNameLabel.isDisplayed();
	}
	public ContactsPage clickOnContactsLink() throws Exception
	{
		contactsLink.click();
		return  new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink()
	{
		dealsLink.click();
		return  new DealsPage();
	}
	public TasksPage clickOnTasksLink() throws Exception
	{
		tasksLink.click();
		return  new TasksPage();
	}
	
	
	public void clickonNewContactLink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(contactsLink).click().build().perform();
		newContactLink.click();
		
		
	}
	
	
	
}
