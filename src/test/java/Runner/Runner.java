package Runner;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"Steps"},
plugin = {"pretty:STDOUT", "html:C:\\Users\\Mahesh Nukala\\SandhyaWorkspace\\Demo\\Reports\\Cucumber-html" ,
		"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Mahesh Nukala\\SandhyaWorkspace\\Demo\\Reports\\Cucumber-Extent\\Extent-report.html"
		},
tags={"@SanityScenarioOfMercuryToursPage"}

)*/


public class Runner {
	
	public static void main(String args[]){
		Result result=JUnitCore.runClasses(Testcases.SanityTestingUsingExcel.class);
		List<Failure> fail=result.getFailures();
		while(!fail.isEmpty()){
			System.out.println(fail.toString());
		}
		System.out.println("Result" + result.wasSuccessful());
	}
	
	@AfterClass
    public static void tearDown() throws IOException {
        Reporter.loadXMLConfig(new File("Features/extent-config.xml"));
        Reporter.addScreenCaptureFromPath("C:\\Users\\Mahesh Nukala\\SandhyaWorkspace\\Demo\\Screenshots\\1.png", "SignUpSuccess");
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("2.53.0", "selenium");
        Reporter.setSystemInfo("64 bit", "Windows 10");
        Reporter.setTestRunnerOutput("Cucumber Junit Test runner");
        Reporter.setSystemInfo("3.3.9", "maven");
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
    }

}
