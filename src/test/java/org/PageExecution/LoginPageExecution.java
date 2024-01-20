package org.PageExecution;

import org.Locators.BookHotelLocaters;
import org.Locators.LoginPageLocaters;
import org.baseclass.BaseClass;

public class LoginPageExecution extends BookHotelLocaters{
	public static void username(String u) {
		BaseClass.typedata(new LoginPageLocaters().getUserName() , u);
	}
	
	public static void password(String p) {
		BaseClass.typedata(new LoginPageLocaters().getPassWord(), p);
	}
	
	public static void login() {
		BaseClass.click(new LoginPageLocaters().getLogin());
	}

}
