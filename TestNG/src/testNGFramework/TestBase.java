package testNGFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase 
{	
	public WebDriver driver = null ;
	
	@Test
	public void openBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\SARJERAO\\eclipse-workspace\\TestNG\\src\\testNGFramework\\datadriven.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}
		else if(prop.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\SARJERAO\\IMP Docs\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
						
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C:\\SARJERAO\\IMP Docs\\Study\\Selenium\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}
	}
}



















