package ins.aiite.unstableScenarios;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class FailedTestCaseListener implements IAnnotationTransformer{
	
	 public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		 annotation.setRetryAnalyzer(FailedTestCaseRetry.class);  
		 
		  }
	
	
	

}
