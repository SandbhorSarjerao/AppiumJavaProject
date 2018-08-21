package scripts;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikipediaUnitTest 
{
	WebDriver driver = null ;
	
	@Before
	public void setUp() throws Exception 
	{	
		driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	@Test
	public void test() throws Throwable 
	{
		// fail("Not yet implemented");
		
		WebElement lnk_English = driver.findElement(By.id("js-link-box-en"));
		lnk_English.click();
		WebElement txtBox_Search = driver.findElement(By.id("searchInput"));
		txtBox_Search.sendKeys("Selenium");
		WebElement btn_Search = driver.findElement(By.id("searchButton"));
		btn_Search.click();
		
		String fileWithPath = "C:\\Users\\SARJERAO\\Desktop\\Screenshot\\4.jpg";
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(ScrFile, DestFile);
	}

}
