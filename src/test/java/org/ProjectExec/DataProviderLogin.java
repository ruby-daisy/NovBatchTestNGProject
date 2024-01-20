package org.ProjectExec;

import org.PageExecution.BookHotelPageExecution;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin extends BookHotelPageExecution{
	
	@Test(priority = 1,dataProvider = "loginData")
	public static void loginClick(String user,String pass)
	{
			browserlaunch();
			maximizeWindow();
			getUrl(readProperty("url"));
			username(user);
			password(pass);
			login();
	}

	
	@DataProvider(name="loginData")
	public Object[][] pickData()
	{
		Object[][] ob1=covertExcelToTwoDimenArray();
		return ob1;		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		closeDriver();
	}
}
