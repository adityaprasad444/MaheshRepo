package Testcases;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class CookieExample {
	
	@Test
	public void cookieExample(){
		System.setProperty("webdriver.ie.driver", ".\\Drivers/IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		
		driver.get("http://www.example.com");

		// Now set the cookie. This one's valid for the entire domain
		Cookie cookie = new Cookie("key", "value");
		driver.manage().addCookie(cookie);

		// And now output all the available cookies for the current URL
		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie loadedCookie : allCookies) {
		    System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
		}

		// You can delete cookies in 3 ways
		// By name
		driver.manage().deleteCookieNamed("CookieName");
		// By Cookie
		//driver.manage().deleteCookie(loadedCookie);
		// Or all of them
		driver.manage().deleteAllCookies();
	}

}
