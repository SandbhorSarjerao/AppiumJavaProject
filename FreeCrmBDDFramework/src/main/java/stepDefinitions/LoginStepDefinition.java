package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition 
{
	WebDriver driver ;
	
	
	@Given("^user is already on the login page$")
	public void user_already_on_login_page()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com");
	}
	
	@When("^title of the login page is Free CRM$")
	public void title_of_the_login_page_is_Free_CRM()
	{
		String title = driver.getTitle();	
		System.out.println(title);
		// Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
		if(title=="Free CRM software in the cloud powers sales and customer service")
		{
			System.out.println("Correct Title is showing");
		}
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password()
	{
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()
	{
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	
}
