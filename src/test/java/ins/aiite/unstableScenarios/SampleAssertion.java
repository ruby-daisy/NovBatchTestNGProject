package ins.aiite.unstableScenarios;

import org.testng.Assert;
import org.testng.annotations.*;

public class SampleAssertion {
	
	
	@Test
	public void validatepageTitle1()
	{
		String expected="Aiite academy";
		String actual="AiiteAcademy";
		if(actual.equals(expected))		
			System.out.println("PASS");		
		else
			System.out.println("FAIL");
		
	}
	//Unstable Testcase
	@Test(retryAnalyzer = FailedTestCaseRetry.class)
	public void validatepageTitle2()
	{
		String expected="Aiite academy";
		String actual="AiiteAcademy";
		Assert.assertEquals(expected, actual);		
	}
	
	@Test
	public void validatepageTitle3()
	{
		String expected="Aiite Academy";
		Assert.assertTrue(expected.contains("Academy")); //pass
			
	}
	
	@Test
	public void validatepageTitle4()
	{
		String expected="Aiite Academy";
		Assert.assertTrue(expected.contains("academy")); //fail
			
	}
	
	@Test
	public void validatepageTitle5()
	{
		String expected="Aiite Academy";
		Assert.assertFalse(expected.contains("Aiite Academy")); //fail
			
	}
	

}
