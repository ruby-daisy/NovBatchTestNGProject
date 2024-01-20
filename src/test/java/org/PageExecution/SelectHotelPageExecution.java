package org.PageExecution;

import org.Locators.SelectHotelLocaters;
import org.baseclass.BaseClass;

public class SelectHotelPageExecution extends SearchHotelPageExecution{
	public static void selectButton() {
		BaseClass.click(new SelectHotelLocaters().getSelectHotel());
	}
	
	public static void continuee() {
		BaseClass.click(new SelectHotelLocaters().getContinue());
	}
	
}
