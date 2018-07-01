package dataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GoogleSearchTest 
{
	public WebDriver driver ;
	public WebElement SearchText ;
	
	@BeforeTest
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/*@BeforeMethod
	public void launchBrowser()
	{
		
	}*/
	
	@Test
	public void searchTest1_howStuffWorks() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@name='q']"));
		SearchText.click();
		SearchText.sendKeys("how stuff works ?");
		Thread.sleep(500);
	}
	
	@Test (dependsOnMethods= {"searchTest1_howStuffWorks"}, alwaysRun=true)
	public void searchTest2_whatToSearch() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@name='q']"));
		SearchText.click();
		SearchText.sendKeys("how to control wife ?");
		Thread.sleep(500);
	}
	
	@Test (enabled=false)
	public void searchTest3_howSeleniumWorks() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@name='q']"));
		SearchText.click();
		SearchText.sendKeys("how Selenium Works ?");
		Thread.sleep(500);
	}
	
	@Test (timeOut = 5000)
	public void searchTest4_howtolost() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@name='q']"));
		SearchText.click();
		SearchText.sendKeys("how to lost ?");
		Thread.sleep(500);
	}
	
	@Test (groups= {"Priority1"})
	public void searchTest5_howtoPlay() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@name='q']"));
		SearchText.click();
		SearchText.sendKeys("how to Play Games ?");
		Thread.sleep(500);
	}
	
	@Test (groups= {"Priority1"})
	public void searchTest6_howtoAttemptSucide() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@name='q']"));
		SearchText.click();
		SearchText.sendKeys("how to Attempt Sucide ?");
		Thread.sleep(500);
	}
	
	@Test (groups= {"Priority1"})
	public void searchTest7_howtoKill() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@id='uh-search-box']"));
		SearchText.click();
		SearchText.sendKeys("how to Kill ?");
		Thread.sleep(500);
	}
	
	@Test (dataProvider="getData")
	public void loginGoogle(String username, String password)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		WebElement SIGNIN = driver.findElement(By.xpath("//*[text()='Sign In']"));
		SIGNIN.click();
		
		WebElement EmailID = driver.findElement(By.xpath("//input[@id='identifierId']"));
		EmailID.sendKeys(username);
		
		WebElement NextButton = driver.findElement(By.xpath("//*[@id='identifierNext']"));
		NextButton.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		passwordField.sendKeys(password);
		
		WebElement NextButton2 = driver.findElement(By.xpath("//*[@id='passwordNext']"));
		NextButton2.click();
	}
	
	@AfterMethod
	public void clearSearchText() throws InterruptedException
	{
		SearchText = driver.findElement(By.xpath("//*[@name='q']"));
		SearchText.clear();
		SearchText.sendKeys("");
		Thread.sleep(300);
	}
	
	@AfterTest
	public void deleteCookies_closeBrowser()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][2];
		
		data[0][0] = "sandbhorsarjerao@gmail.com" ;
		data[0][1] = "Rajguru@3" ;
		
		return data;
		
	}
}





















