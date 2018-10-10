package scripts1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikipendiaSearchText {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		WebElement lnk_English = driver.findElement(By.id("js-link-box-en"));
		lnk_English.click();
		WebElement txtBox_Search = driver.findElement(By.id("searchInput"));
		txtBox_Search.sendKeys("Selenium");
		WebElement btn_Search = driver.findElement(By.id("searchButton"));
		btn_Search.click();
		
		String fileWithPath = "C:\\Users\\SARJERAO\\Desktop\\Screenshot\\1.jpg";
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(ScrFile, DestFile);		
		
		
		
		

	}

}
