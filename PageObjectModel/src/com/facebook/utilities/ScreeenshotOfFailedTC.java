package com.facebook.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreeenshotOfFailedTC {
	
	public static void captureScreenShot(WebDriver driver, String TcName) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots"+TcName+".png"));
		
	}

}
