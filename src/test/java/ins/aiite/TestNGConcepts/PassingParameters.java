package ins.aiite.TestNGConcepts;

import org.PageExecution.BookHotelPageExecution;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class PassingParameters extends BookHotelPageExecution{
	
	@Parameters("browser")
	@Test(priority = 1)
	public static void loginClick(String bname)
	{
		
			System.out.println(bname);
			selectBrowser(bname);
			maximizeWindow();
			getUrl(readProperty("url"));
			username("daisyrubycatharine");
			password("RDAYGO");
			login();
	}
	
	
	

}
