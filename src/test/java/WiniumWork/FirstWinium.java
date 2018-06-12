package WiniumWork;


import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class FirstWinium {
	
	public static void main(String args[])throws Exception{
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");			
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
		Thread.sleep(6000);
		driver.findElementByName("Eight").click();
		Thread.sleep(2000);
		driver.findElementById("plusButton").click();
		driver.findElementById("num5Button").click();
		driver.findElementById("equalButton").click();
		driver.findElementById("plusButton").click();
		driver.findElementById("num8Button").click();
		Thread.sleep(2000);
		String total=driver.findElementById("CalculatorResults").getAttribute("Name");
		System.out.println(total);
		
	
		
	}

}
