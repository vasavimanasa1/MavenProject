package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase
{
	@FindBy(xpath="//td[contains(text(),' Contacts')]")
	WebElement contactspageLabel;
	
	@FindBy(xpath="//input[@type='button' and @value='New Contact']")
	WebElement NewContactBtn;
	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="surname")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement companyName;
	
	
	@FindBy(xpath="//input[@name='cs_email']")
	WebElement emailTextField;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactbtn;
	
	@FindBy(xpath= "//input[@value='Save and Create Another (same company)']")
	WebElement saveBtn;
	

	public ContactsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	/*public void selectContactByName(String name)
	{
		//driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
		//		+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']"));
		
		//driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input")).click();
		driver.findElement(By.xpath("")).click();
	}*/
	
	//Actions
	public void verifycontactsPageLabel()
	{
		contactspageLabel.isDisplayed();
	}
	
	public void createNewContact(String title,String ftname,String ltname,String comp)
	{
		NewContactBtn.click();
		Select s=new Select(driver.findElement(By.name("title")));
		s.selectByVisibleText(title);
		FirstName.sendKeys(ftname);
		LastName.sendKeys(ltname);
		companyName.sendKeys(comp);
		saveBtn.click();
		
		
	}
	
	

}
