package ins.aiite.TestNGConcepts;

import org.testng.annotations.Test;

public class DependsOnMethodSample {
	
	@Test(dependsOnMethods={"userName"})
	public void passWord()
	{
		System.out.println("passWord");
	}
	@Test
	public void userName()
	{
		System.out.println("userName");
	}
	
	@Test(dependsOnMethods={"passWord"})
	public void loginClick()
	{
		System.out.println("dependsOnMethods-loginClick");
	}

}
