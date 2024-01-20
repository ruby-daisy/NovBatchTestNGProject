package ins.aiite.TestNGConcepts;

import org.testng.annotations.Test;

public class InvoCountSample {
	@Test(invocationCount = 50)
	public void testOne()
	{
		System.out.println("testOne:Sanity");
	}

}
