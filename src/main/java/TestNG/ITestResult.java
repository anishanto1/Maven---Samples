package TestNG;

public interface ITestResult {

	void onTeststart();
	void onTestsuccess();
	void onTestFailure();
	void onTestSkipped();
	void onTestFailedButWithinSuccessPercentage();
	void  onStart();
	void  onFinish();
	
	
	
}
