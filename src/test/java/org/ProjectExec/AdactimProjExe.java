package org.ProjectExec;

import org.PageExecution.BookHotelPageExecution;
import org.testng.annotations.*;

import java.util.*;


public class AdactimProjExe extends BookHotelPageExecution{	
	
	
	
	
	@Test(priority = 1,dataProvider = "loginData",dataProviderClass = DataProviderLogin.class)
	public static void loginClick(String user,String pass)
	{
			browserlaunch();
			maximizeWindow();
			getUrl(readProperty("url"));
			username(user);
			password(pass);
			login();
	}
@Test(priority = 2)
public void searchHotel()
{
		location();
		hotel();
		roomType();
		noOfRooms();
		checkInDate();
		checkOutDate();
		adultsPerRoom();
		childrenPerRoom();
		search();
}
@Test(priority = 3)
public void selectHotel()
{
		selectButton();
		continuee();
}
@Test(priority = 4) //,enabled=false)
public  void BookHotel()
{
	firstName();
	lastName();
	billingAddress();
	creditCardNum();
	cardType();
	month();
	year();
	ccvNumber();
	bookNow();
	implicitlyWait();
	//orderNo("sheet0", 1, 1);
}
@AfterClass 
public static void close()
{
	driver.close();
}
@BeforeMethod
public void Before()
{
	Date d=new Date();
	System.out.println(d);
}
@AfterMethod
public void After()
{
	Date d=new Date();
	System.out.println(d);
}
}
