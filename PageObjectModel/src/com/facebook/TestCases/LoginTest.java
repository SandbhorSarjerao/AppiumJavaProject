package com.facebook.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.MPage.MasterPage;
import com.facebook.Pages.LoginPage;
import com.facebook.utilities.ReadDataFromExcel;
import com.facebook.utilities.ScreeenshotOfFailedTC;

public class LoginTest {
	@Test(dataProvider="sendData")
	public void LoginTestCase(String userName, String Password)throws Throwable {
		if(ReadDataFromExcel.isTestRunable("LoginTest"))
		{
		LoginPage lp = new LoginPage();
	//	boolean result=lp.doLogin();
		Assert.assertTrue(lp.doLogin(userName ,Password), "Login failed");
			
		}
				}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
		if(result.FAILURE==result.getStatus())//1: Pass & 2:fail 
		{//call screenshot capture utlitlity
			ScreeenshotOfFailedTC.captureScreenShot(MasterPage.driver, result.getName());
		}
	}
	
@DataProvider
public Object[][] sendData() throws IOException
{
	return(ReadDataFromExcel.readTCData("LoginTest"));
}
}
































