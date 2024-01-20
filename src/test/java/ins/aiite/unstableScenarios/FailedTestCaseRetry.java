package ins.aiite.unstableScenarios;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedTestCaseRetry implements IRetryAnalyzer{
	int min=0,max=5;
	public boolean retry(ITestResult result) {
		
		if(min<max)
		{
			min++;
			return true;
			
		}	
		
		return false;
	}
	

}
