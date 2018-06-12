package Steps;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import Pages.MercuryToursSignupPage;
import Utility.BrowserFactory;
import Utility.CaptureScreenshot;
import Utility.ConfigReader;
import Utility.ExcelReader;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MercuryToursSanitySteps {
	
	public WebDriver driver;
	ConfigReader CR= new ConfigReader();
	MercuryToursSignupPage MTSP;
	
	@Given("^I open \"([^\"]*)\" and provided url for signup$")
	public void i_open_and_provided_url_for_signup(String browser) throws Throwable {
	    driver=BrowserFactory.startBrowser(browser, CR.getMercurySignUpUrl());
	}

	@Given("^I provided details for signUp in \"([^\"]*)\"$")
	public void i_provided_details_for_signUp_in(int iteration) throws Throwable {
		MTSP= new MercuryToursSignupPage(driver);
	    ExcelReader ER= new ExcelReader(CR.getExcel2Path());
	    System.out.println(ER.getData(1, iteration, 1));
	    MTSP.signupInMercuryTours(ER.getData(1, iteration, 0),ER.getData(1, iteration, 1), ER.getData(1, iteration, 2),
								    		ER.getData(1, iteration, 3), ER.getData(1, iteration, 4), ER.getData(1, iteration, 5),
								    		ER.getData(1, iteration, 6), ER.getData(1, iteration, 7), ER.getData(1, iteration, 8),  
								    		ER.getData(1, iteration, 9), ER.getData(1, iteration, 10), ER.getData(1, iteration, 11));
	}

	@When("^I clicked on SignIn Button$")
	public void i_clicked_on_SignIn_Button() throws Throwable {
	    System.out.println("Clicked on SignIn Button");
	    }

	@Then("^Useraccount should be created successfully$")
	public void useraccount_should_be_created_successfully() throws Throwable {
	    System.out.println("User is created successfully");
	    
	}
	
	@Then("^I captured screenshot with screenname as \"([^\"]*)\"$")
	public void i_captured_screenshot_with_screenname_as(String iteration) throws Throwable {
	   String dest= CaptureScreenshot.captureScreenshot2(driver, iteration);
	   Reporter.addScreenCaptureFromPath(dest);
	   Reporter.addStepLog("Screenshot captured for " + iteration);
	}
	
	
}
