package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public void implicitWait(WebDriver driver,int timeInSeconds){
		driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
	}
	
	public void sleep(int milliSeconds) throws Throwable{
		Thread.sleep(milliSeconds);
	}
	
	public void ExplicitWait(WebDriver driver, WebElement elementId, int timeInSseconds){
		WebDriverWait wait= new WebDriverWait(driver,timeInSseconds);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
	}
}
