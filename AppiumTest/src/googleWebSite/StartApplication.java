package googleWebSite;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartApplication 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		// Create object of DesiredCapabilities Class and Specify android platform
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		
		// set the capability to execute our test in chrome browser
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);

		// set the capability to execute our test in Android Platform
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"Android");
	
		// we need to define Platform name
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"my phone");
			
		capabilities.setCapability(MobileCapabilityType.VERSION,"7.0");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		WebDriver driver = new AndroidDriver<>(url,capabilities);
		
		driver.get("https://www.google.com");
		
		System.out.println("Page Title => " + driver.getTitle());
		
	}

}
