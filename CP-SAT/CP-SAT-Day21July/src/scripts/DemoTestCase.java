package scripts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTestCase 
{
	WebDriver driver = null ;

	@Before
	public void setUp() throws Exception 
	{
		driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	@Test
	public void test() 
	{
		// fail("Not yet implemented");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement btn_JSAlert = driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]"));
		btn_JSAlert.click();
		
		driver.switchTo().alert();
		// driver.switchTo().alert().dismiss();
		driver.switchTo().parentFrame();
		
		WebElement btn_JSAlertConfirm = driver.findElement(By.xpath("//*[contains(text(),'Click for JS Confirm')]"));
		btn_JSAlertConfirm.click();
		
		
	}

}
