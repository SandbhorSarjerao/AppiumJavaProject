package com.facebook.MPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {
	public static WebDriver driver;
	public Properties prop;
	
	public MasterPage() throws Throwable
	{
		FileInputStream ip = new FileInputStream("D:\\Bipin\\14th April Batch\\PageObjectModel\\src\\com\\facebook\\ObjectRepository\\OR.properties");
		prop = new Properties();
		prop.load(ip);
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\com\\facebook\\ThirdPartydrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(prop.getProperty("browser").equals("IE"))
		{
			//intilatize IE here
		}
		else {		
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}

public void sendUserData(String xpathKey, String userData)
{
	driver.findElement(By.xpath(prop.getProperty(xpathKey))).sendKeys(userData);
}
	
public void click(String xpathKey)
{
	driver.findElement(By.xpath(prop.getProperty(xpathKey))).click();
}
public boolean isLinkPresent(String xpathKey)
{
	try {
	driver.findElement(By.xpath(prop.getProperty(xpathKey)));
	return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
}






























