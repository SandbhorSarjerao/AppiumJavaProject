package scripts1;

import java.io.File;

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

public class GoogleUnitTest 
{
	public WebDriver driver = null ;

	@Before
	public void setUp() throws Exception 
	{
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
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
		By textby = new By.ById("lst-ib");
		WebElement textBox = driver.findElement(textby);
		textBox.sendKeys("CP-SAT");
		
		WebElement googleSearchBtn = driver.findElement(By.name("btnK"));
		googleSearchBtn.click();
		
		String fileWithPath = "C:\\Users\\SARJERAO\\Desktop\\Screenshot\\3.jpg";
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(ScrFile, DestFile);
	}

}
