package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * BrowserFactory.java - This class is mainly used to launch 
 * the browser and perform operations related to browser launch
 * @author Nukala Mahesh
 * @param browsername, url
 * @return driver
 * Date - 12-19-2017	
 */

public class BrowserFactory {

	static WebDriver driver;
	ConfigReader CR= new ConfigReader();
	
	/**
	 * startBrowser - This method is used to launch browser and enter the URL
	 * @author Nukala Mahesh
	 * @param browsername, url
	 * @return driver
	 * Date - 12-19-2017	
	 */
	
	
	public static WebDriver startBrowser(String browsername, String url){
		if(browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); caps.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");

			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		
		return driver;
	}
	
}
