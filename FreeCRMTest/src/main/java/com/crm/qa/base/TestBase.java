package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
 	public static WebEventListener eventListener;
	
	
	public TestBase() throws Exception
	{
		try 
		{

		prop=new Properties();
		FileInputStream ip=new FileInputStream("F:\\MavenProject\\FreeCRMTest\\src\\main\\java\\com\\crm"
					+ "\\qa\\config\\config.properties");
			prop.load(ip);
			
		} 
		catch (FileNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		
	}
	
	public static void initilization() throws Exception
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		
		
	   }
		else
		{
			System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
			//driver= new FirefoxDriver();
			FirefoxOptions options=new FirefoxOptions();
			driver=new RemoteWebDriver(new URL("http://localhost:1712/wd/hub"), options);
		}
		e_driver = new EventFiringWebDriver(driver);
 		// Now create object of EventListerHandler to register it with EventFiringWebDriver
 		eventListener = new WebEventListener();
 		e_driver.register(eventListener);
 		driver = e_driver;
	
			
driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
}
}