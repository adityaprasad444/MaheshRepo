package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.CaptureScreenshot;

public class ListenersExample implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case is failed and test case details are: "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case is skipped and test case details are: "+ result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is about to started and test case details are: "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Hurray!!!Test case success and test case details are:"+ result.getName());
		
	}

	
}
