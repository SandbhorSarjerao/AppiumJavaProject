package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest 
{
	public WebDriver driver ;
	public WebElement SearchText ;
	
	@BeforeTest
	public void openBrowserFF()
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
}
