package SikuliWork;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class OnlinePainting {

public static void main(String[] args) throws FindFailed, InterruptedException {

System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();

WebDriverWait wait=new WebDriverWait(driver,20);

driver.manage().window().maximize();



driver.get("http://www.thecolor.com/Coloring/a-puppy-with-a-kitten.aspx");
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
Screen screen=new Screen();
Pattern image1=new Pattern("C:\\Users\\Mahesh Nukala\\Desktop\\recent.png");
screen.click(image1);
Thread.sleep(5000);

}

}

