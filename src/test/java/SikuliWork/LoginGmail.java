package SikuliWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class LoginGmail {

		@Test
		public void login() throws Exception{
		Screen src= new Screen();
		Pattern uname= new Pattern("C:\\Users\\Mahesh Nukala\\Pictures\\Sikuli\\Username.PNG");
		Pattern password= new Pattern("C:\\Users\\Mahesh Nukala\\Pictures\\Sikuli\\password.PNG");
		Pattern signInBtn= new Pattern("C:\\Users\\Mahesh Nukala\\Pictures\\Sikuli\\loginButton.PNG");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Nukala\\SandhyaWorkspace\\Demo\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		src.setAutoWaitTimeout(30);
	
		src.type(uname,"maheshnukala@gmail.com");
		src.type(password,"Pass123333");
		src.click(signInBtn);				
		

	}

}
