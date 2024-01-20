package ins.aiite.TestNGConcepts;

import org.testng.annotations.Test;

public class GroupingSample {
	
	@Test(groups = {"Sanity"},priority=2)
	public void testOne()
	{
		System.out.println("testOne:Sanity");
	}
	
	@Test(groups = {"Sanity","Regression"},priority=1)
	public void testTwo()
	{
		System.out.println("testTwo:Sanity&Regression");
	}
	
	@Test(groups = {"Smoke"})
	public void testThree()
	{
		System.out.println("testThree:Smoke");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void testFour()
	{
		System.out.println("testFour:Smoke&Regression");
	}
	
	
	@Test(groups = {"Regression"})
	public void testFive()
	{
		System.out.println("testFive:Regression");
	}
	
	@Test(groups = {"Regression"})
	public void testSix()
	{
		System.out.println("testSix:Regression");
	}

}
