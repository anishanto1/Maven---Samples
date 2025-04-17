package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class Listeners implements ITestListener{

	
	public void onTeststart(ITestResult result)
	{
		System.out.println(" TestCase is going to Execute ");
	}

	
	public void onTestsuccess(ITestResult result) {

		System.out.println(" Testcase is Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase is Failed ");
	}


	public void onTestSkipped (ITestResult result) {
		System.out.println(" TestCase is Skipped ");
	}


	public void onTestFailedButWithinSuccessPercentage (ITestResult result) {
		System.out.println(" TestCase is Skipped ");

	}
	
	
	public void onStart (ITestResult result) {
		System.out.println(" Before Everything ");
	}

	
	public void onFinish (ITestResult result) {
		System.out.println(" After Everything ");


	}	


}
