package scripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchText {

	public static void main(String[] args) 
	{
		/*
		 File path = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		 FirefoxBinary ffBinary = new FirefoxBinary(path);
		 FirefoxProfile firefoxProfile = new FirefoxProfile();
		 WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		*/
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		By textby = new By.ById("lst-ib");
		WebElement textBox = driver.findElement(textby);
		textBox.sendKeys("CP-SAT");
		
		WebElement googleSearchBtn = driver.findElement(By.name("btnK"));
		googleSearchBtn.click();

	}

}
