package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.FacebookLoginPage;
import Utility.BrowserFactory;
import Utility.CaptureScreenshot;
import Utility.ConfigReader;
import Utility.ExcelReader;
import Utility.ExcelWriter;

public class SanityTestingUsingExcel {
	
	BrowserFactory BR= new BrowserFactory();
	ConfigReader CR= new ConfigReader();
	ExcelReader ER= new ExcelReader(CR.getExcelPath());
	ExcelWriter EW= new ExcelWriter(CR.getExcelPath());
	WebDriver driver;
	
	//retryAnalyzer=Listeners.RetryAnalyzer.class
	@Test()
	@Parameters(value="browser")
	public void loginWithExcel(String browserName){
		
		driver= BrowserFactory.startBrowser(browserName,CR.getApplicationURL());
		FacebookLoginPage FB= new FacebookLoginPage(driver);
		int rows=ER.getRowCount(0);
		for(int i=0;i<rows;i++){
			FB.loginToAccount(ER.getData(0, i, 0), ER.getData(0, i, 1));
			ER.writeData(0, i, 2, "passed", CR.getExcelPath());
		}
				
	}
	@AfterMethod()
	public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			CaptureScreenshot.captureScreenshot(driver, System.currentTimeMillis());
		}
		driver.close();
	}
}
