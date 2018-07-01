package stepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	
	private WebDriver driver = null;
	public static Properties properties = new Properties();
	public static FileInputStream objfile;
	
	protected void loadPropertiesFile() throws FileNotFoundException{
		objfile = new FileInputStream(new File("src\\test\\resources\\configurations\\OR.properties"));
		try {
			properties.load(objfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Given("^user is on the iConnect login page$")
	public void user_is_on_the_iConnect_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "F:\\training_sdet\\src\\test\\resources\\setup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		loadPropertiesFile();
		driver.get("https://iconnect.fs.capgemini.com"); 
		Thread.sleep(3000);
	}

	@When("^user enters the login credentials user name (.*) and password (.*)$")
	public void user_enters_the_login_credentials(String userName, String safeWordToken) throws Throwable {
		driver.findElement(By.xpath(properties.getProperty("employeeRadioButton"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(properties.getProperty("loginUserName"))).sendKeys(userName);
		driver.findElement(By.id(properties.getProperty("loginSafeWordToken"))).sendKeys(safeWordToken);
		driver.findElement(By.name(properties.getProperty("loginButton"))).click();
	    
	}

	@Then("^user should be able to successfully login to iConnect page$")
	public void user_should_be_able_to_successfully_login_to_iConnect_page() throws Throwable {
	   driver.close();
	}

}