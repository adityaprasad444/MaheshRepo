package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Utility.BrowserFactory;
import Utility.ConfigReader;
import Utility.Wait;


/**
 * FacebookLoginPage.java - It is used to capture the page object elements of facebook login page
 * @author Nukala Mahesh
 * @version 1.7
 * Date - 12-19-2017	
 */
public class FacebookLoginPage {

	
	WebDriver driver;
	Wait wait= new Wait();
	ConfigReader CR= new ConfigReader();
	

	/**
	 * Initializing the constructor of facebookloginPage
	 * @param driver
	 * Date - 12-19-2017	
	 */
	public FacebookLoginPage(WebDriver driver) {   
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath=".//*[@id='email']") WebElement username;
	@FindBy(xpath=".//*[@id='pass']") WebElement password;
	@FindBy(id="loginbutton") WebElement SignInBtn;
	@FindBy(xpath=".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a") WebElement ForgetLink;
	@FindBy(xpath=".//*[@id='u_0_g']") WebElement FirstName;
	@FindBy(xpath=".//*[@id='u_0_i']") WebElement SurName;
	@FindBy(xpath=".//*[@id='u_0_l']") WebElement MobileNumber;
	@FindBy(xpath=".//*[@id='u_0_s']") WebElement NewPassword;
	@FindBy(xpath=".//*[@id='day']") WebElement Day;
	@FindBy(xpath=".//*[@id='month']") WebElement Month;
	@FindBy(xpath=".//*[@id='year']") WebElement Year;
	@FindBy(xpath=".//*[@id='u_0_6']") WebElement FemaleGender;
	@FindBy(xpath=".//*[@id='u_0_7']") WebElement MaleGender;
	@FindBy(xpath=".//*[@id='birthday-help']") WebElement BirthdayHelp;
	@FindBy(xpath=".//*[@id='u_0_y']") WebElement CreateAcountBtn;
	
	public void enterUserName(String userId){
		username.clear();
		username.sendKeys(userId);		
	}
	public void enterPassword(String pwd){
		password.clear();
		password.sendKeys(pwd);
	}
	public void clickSignIn(){
		SignInBtn.click();
	}
	public void clickForget(){
		ForgetLink.click();
	}
	public void enterFirstName(String fname){
		FirstName.sendKeys(fname);		
	}
	public void enterSurrName(String sname){
		SurName.sendKeys(sname);		
	}
	public void enterMobileNumber(String mobile){
		MobileNumber.sendKeys(mobile);		
	}
	public void enterNewPassword(String newPwd){
		NewPassword.sendKeys(newPwd);		
	}
	public void enterDay(String day){
		Select dd= new Select(Day);
		dd.selectByVisibleText(day);
	}
	public void enterMonth(String month){
		Select MM= new Select(Month);
		MM.selectByVisibleText(month);	
	}
	public void enterYear(String year){
		Select YYYY= new Select(Year);
		YYYY.selectByVisibleText(year);
	}
	/**
	 * This method is used to enter date of birth in signup section
	 * @author Nukala Mahesh
	 * @param Day, Month and Year
	 * Date - 12-19-2017	
	 */
	public void enterDob(String day,String month,String year){
		Select dd= new Select(Day);
		dd.selectByVisibleText(day);
		Select MM= new Select(Month);
		MM.selectByVisibleText(month);
		Select YYYY= new Select(Year);
		YYYY.selectByVisibleText(year);
	}
	public void selectFemale(){
		FemaleGender.click();		
	}
	public void selectMale(){
		MaleGender.click();	
	}
	public void clickBirthdayHelp(){
		BirthdayHelp.click();	
	}
	public void createAccountBtn(){
		CreateAcountBtn.click();
	}
	
	/**
	 * This method is used to login to Account in facebook login page
	 * @author Nukala Mahesh
	 * @param Username, Password
	 * Date - 12-19-2017	
	 */
	public void loginToAccount(String userId, String pwd ){
		enterUserName(userId);
		enterPassword(pwd);
		clickSignIn();
		if(driver.getTitle().contains("help")){
			driver.get(CR.getApplicationURL());
		}
	}
	
	/**
	 * This method is used to create account in facebook login page
	 * @author Nukala Mahesh
	 * @param FirstName, SurName, Mobile ,New Password, Day, Month, Year
	 * Date - 12-19-2017	
	 */
	public void signUp(String fname,
					   String sname,
			           String mobile,
			           String newPwd,
			           String day,
			           String month,
			           String year
					  )
	{
		enterFirstName(fname);
		enterSurrName(sname);
		enterMobileNumber(mobile);
		enterNewPassword(newPwd);
		enterDay(day);
		enterMonth(month);
		enterYear(year);
		selectMale();
		createAccountBtn();
		
	}
}
