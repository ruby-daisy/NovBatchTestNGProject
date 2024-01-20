package org.ProjectExec;

import org.testng.Assert;
import org.testng.annotations.*;



public class SampleAssertionPgm {
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void bSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void at()
	{
		System.out.println("AfterTest");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("@BeforeClass");
	}
	
	
	@AfterClass
	public void ac()
	{
		System.out.println("AfterClass");
	}
	
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("BeforeMethod");
	}
	
	
	@AfterMethod
	public void am()
	{
		System.out.println("AfterMethod");
	}	
	
	
	
	
	@Test
	public  void username()
	{
		String expected = "AndhraPradesh";
		String actual = "andhraPradesh";
		if(expected==actual)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
	@Test
	public void password()
	{
		String expected = "AndhraPradesh";
		String actual = "andhraPradesh";
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void login()
	{
		String expected = "AndhraPradesh";
		Assert.assertTrue(expected.contains("Andhra"));
	}
	@Test
	public void select()
	{
		String expected = "AndhraPradesh";
		Assert.assertTrue(expected.contains("andhra"));
	}
	@Test
	public void book()
	{
		String expected = "AndhraPradesh";
		Assert.assertFalse(expected.contains("Telugu"));
	}
}
