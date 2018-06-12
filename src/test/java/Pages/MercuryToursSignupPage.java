package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.ConfigReader;
import Utility.Wait;

public class MercuryToursSignupPage {
	
	WebDriver driver;
	Wait wait= new Wait();
	ConfigReader CR= new ConfigReader();
	

	/**
	 * Initializing the constructor of MercuryToursSignUpPage
	 * @param driver
	 * Date - 12-19-2017	
	 */
	public MercuryToursSignupPage(WebDriver driver) {   
		
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	
	//Declaring all the page elements here
	
	@FindBy(xpath="//input[@name='firstName']") WebElement FirstName;
	@FindBy(xpath="//input[@name='lastName']") WebElement LastName;
	@FindBy(xpath="//input[@name='phone']") WebElement Phone;
	@FindBy(xpath="//input[@id='userName']") WebElement Email;
	@FindBy(xpath="//input[@name='address1']") WebElement Address1;
	@FindBy(xpath="//input[@name='address1']") WebElement Address2;
	@FindBy(xpath="//input[@name='city']") WebElement City;
	@FindBy(xpath="//input[@name='state']") WebElement State;
	@FindBy(xpath="//input[@name='postalCode']") WebElement PostalCode;
	@FindBy(xpath="//select[@name='country']") WebElement Country;
	@FindBy(xpath="//input[@id='email']") WebElement UserName;
	@FindBy(xpath="//input[@type='password']") WebElement Password;
	@FindBy(xpath="//input[@name='confirmPassword']") WebElement ConfirmPassword;
	@FindBy(xpath="//input[@name='register']") WebElement SignInBtn;
	
	
	
	
	
	/**
	 * Creating method for signup in Mercury tours page
	 * @param driver
	 * Date - 01-05-2018	
	 */
	
	public void signupInMercuryTours(String Fname, String Lname, String phone,
									String email, String address1, String address2,
									String city, String state, String postalCode, 
									 String username, String pwd,String ConfPwd)
	{
		
		FirstName.sendKeys(Fname);
		LastName.sendKeys(Lname);
		Phone.sendKeys(phone);
		Email.sendKeys(email);
		Address1.sendKeys(address1);
		Address2.sendKeys(address2);
		City.sendKeys(city);
		State.sendKeys(state);
		PostalCode.sendKeys(postalCode);
		selectCountry();
		UserName.sendKeys(username);
		Password.sendKeys(pwd);
		ConfirmPassword.sendKeys(ConfPwd);
		SignInBtn.click();
	}
		
	//Selecting country method
	
		public void selectCountry(){
			Select S= new Select(Country);
			S.selectByValue("92");
		}
	
	

}
