package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CreateNewContactPage extends TestBase
{

	@FindBy(xpath="//input[@id='first_name']")
	WebElement FirstNameTextField;
	
	@FindBy(xpath="//input[@id='middle_initial']")
	WebElement MiddleNameTextField;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement LastNameTextField;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement CompanyTextField;
	
	@FindBy(xpath="//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	
	public CreateNewContactPage() throws Exception
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void info()
	{
		FirstNameTextField.sendKeys("vihari");
		MiddleNameTextField.sendKeys("Siddarth");
		LastNameTextField.sendKeys("Kunchala");
		CompanyTextField.sendKeys("MKGroup");
		saveBtn.click();
		
	}
	
	

}
