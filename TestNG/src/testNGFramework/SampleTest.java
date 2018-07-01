package testNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest 
{
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("This is @BeforeTest");
	}
	
	@BeforeMethod
	public void launchBrowser1()
	{
		System.out.println("This is @BeforeMethod");
	}
	
	@Test
	public void searchTest_howStuffWorks() 
	{
		System.out.println("This is @Test1");
	}
	
	@Test
	public void searchTest_whatToSearch() 
	{
		System.out.println("This is @Test2");
	}
	
	@AfterMethod
	public void launchBrowser2()
	{
		System.out.println("This is @AfterMethod");
	}
	
	@AfterTest
	public void clearText_CloseBrowser() 
	{
		System.out.println("This is @AfterTest");
	}
}
