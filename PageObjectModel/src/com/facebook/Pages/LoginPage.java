package com.facebook.Pages;

import com.facebook.MPage.MasterPage;

public class LoginPage extends MasterPage{
	//write all login related features(methods) such as login, signUp, create page, change language
	
	
	public LoginPage() throws Throwable {
		super();
		
	}
	public boolean doLogin(String ActualUname, String ActualPasswd)
	{		
		sendUserData("txtBox_UserName", ActualUname);
		sendUserData("txtBox_Passwd", ActualPasswd);
		click("btn_login");
		return(isLinkPresent("href_home"));
		
	}
	public void signUp()
	{
		System.out.println("this is signup method");
	}

}









