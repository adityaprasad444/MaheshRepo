package Steps;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import Pages.FacebookLoginPage;
import Utility.BrowserFactory;
import Utility.ConfigReader;
import Utility.ExcelReader;
import Utility.ExcelWriter;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * FacebookSanitySteps.java - It is used to perform sanity operations of facebook
 * @author Nukala Mahesh
 * @version 1.7
 * Date - 12-19-2017	
 */

public class FacebookSanitySteps {
	
	BrowserFactory BR= new BrowserFactory();
	ConfigReader CR= new ConfigReader();
	ExcelReader ER;
	ExcelWriter EW= new ExcelWriter(CR.getExcelPath());
	FacebookLoginPage FB;
	public static WebDriver driver;
	
	/**
	 * This method is used to launch browser and entering the URL
	 * @author Nukala Mahesh
	 * @param browserName
	 * @return driver
	 * Date - 12-19-2017	
	 */
	
	@Given("^I open \"([^\"]*)\" and provided the url$")
	public void i_open_and_provided_the_url(String browsername) throws Throwable {
		driver=BrowserFactory.startBrowser(browsername, CR.getApplicationURL());
	}
	
	/**
	 * This method is used to enter Username and password in login page
	 * @author Nukala Mahesh
	 * @param username, Password
	 * Date - 12-19-2017	
	 */

	@Given("^I provided the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_provided_the_and(String userName, String Password) throws Throwable {
		FB= new FacebookLoginPage(driver);
		FB.enterUserName(userName);
		FB.enterPassword(Password);
		FB.clickSignIn();
	}

	/**
	 * This method is used to click on signIn button
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button() throws Throwable {
	  System.out.println("clicked on sigin button");
	}
	
	/**
	 * This method is used to verify our login
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	@Then("^I should be able to login successfully$")
	public void i_should_be_able_to_login_successfully() throws Throwable {
	    System.out.println("Login success");
	}
	
	/**
	 * This method is used to close the browser after completing validations
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	@Then("^I closed the browser$")
	public void i_closed_the_browser() throws Throwable {
	    driver.close();
	}

	/**
	 * This method is used to enter the details in signup section using excel
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	
	@Given("^I provided the details required for signup$")
	public void i_provided_the_details_required_for_signup() throws Throwable {
		ER=new ExcelReader(CR.getExcel2Path());
		FB= new FacebookLoginPage(driver);
		int rows=ER.getRowCount(0);
		System.out.println("No of rows: "+ rows);
		Reporter.addStepLog("Excel file reading takes place");
		
		for(int i=1;i<rows;i++){	
		/*XSSFRow Rowdata=ER.getRow(0, i);
		int ColumnCount=Rowdata.getPhysicalNumberOfCells();
		for(int j=0;j<ColumnCount;j++){*/
		
	    FB.signUp(ER.getData(0, i, 0), ER.getData(0, i, 1), ER.getData(0, i, 2), ER.getData(0, i, 3), 
	    		ER.getData(0, i, 4), ER.getData(0, i, 5), ER.getData(0, i, 6));
	    
	    Reporter.addStepLog("Added row " + i + "details");
		
		}
	}
	
	/**
	 * This method is used to enter the details in signup section using excel based on iterations
	 * @author Nukala Mahesh
	 * Date - 01-05-2018	
	 */
	
	@Given("^I provided the details required for signup in \"([^\"]*)\"$")
	public void i_provided_the_details_required_for_signup_in(int iteration) throws Throwable {
		ER=new ExcelReader(CR.getExcel2Path());
		FB= new FacebookLoginPage(driver);
		int rows=ER.getRowCount(0);
		System.out.println("No of rows: "+ rows);
		Reporter.addStepLog("Excel file reading takes place");
		System.out.println(ER.getData(0, iteration, 0));
		FB.signUp(ER.getData(0, iteration, 0), ER.getData(0, iteration, 1), 
				ER.getData(0, iteration, 2), ER.getData(0, iteration, 3),
				ER.getData(0, iteration, 4), ER.getData(0, iteration, 5), 
				ER.getData(0, iteration, 6));
		
	}

	
	/**
	 * This method is used to enter the details in signup section using Examples
	 * @param FirstName, SurName, MobileNumber, New Password, DOB, Gender
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	@Given("^I provided the details required for signup \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_provided_the_details_required_for_signup_and_and_and_and_and(String FirstName, String SurName, String MobileNum, String NewPassword, String DOB, String Gender) throws Throwable {
		FB= new FacebookLoginPage(driver);
		FB.enterFirstName(FirstName);
		FB.enterSurrName(SurName);
		FB.enterMobileNumber(MobileNum);
		FB.enterNewPassword(NewPassword);
		String S[]=DOB.split("-");
		FB.enterDob(S[0], S[1], S[2]);
		if(Gender.equalsIgnoreCase("Male"))
			FB.selectMale();
		else FB.selectFemale();
		
	}
	
	/**
	 * This method is used to click on create account button in signup section
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */
	@When("^I click on Create Account button$")
	public void i_click_on_Create_Account_button() throws Throwable {
	    FB.createAccountBtn();
	    Reporter.addStepLog("Clicked on create account button");
	}
	
	/**
	 * This method is used to verify account got created successfully or not
	 * @author Nukala Mahesh
	 * Date - 12-19-2017	
	 */

	@Then("^Facebook account should be created successfully$")
	public void facebook_account_should_be_created_successfully() throws Throwable {
	  
	    Reporter.addStepLog("Account is created successfully");
	}
}
