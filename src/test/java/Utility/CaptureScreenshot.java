package Utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * CaptureScreenshot.java - This class is used to capture screenshot and store in the path specifed
 * @author Nukala Mahesh
 * @version 1.7
 * Date - 12-19-2017	
 */

public class CaptureScreenshot {
	
	/**
	 * captureScreenshot - This method is used to capture screenshot whenever it is called
	 * @author Nukala Mahesh
	 * @param driver, screenshotName
	 * @return destpath
	 * Date - 12-19-2017	
	 */

	public static String captureScreenshot(WebDriver driver,long ScreenshotName){
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String dest=".\\Screenshots\\"+ScreenshotName+".png";
			File destination= new File(dest);
			FileUtils.copyFile(src,destination);
			System.out.println("Screenshot captured");
			return dest;
			
			} catch (Exception e) {
			System.out.println(e.getMessage() + "while taking screenshot,");
			return e.getMessage();
		}
	}
	
	/**
	 * captureScreenshot - This method is used to capture screenshot whenever it is called
	 * @author Nukala Mahesh
	 * @param driver, screenshotName
	 * @return destpath
	 * Date - 01-11-2018	
	 */

	public static String captureScreenshot2(WebDriver driver,String ScreenshotName){
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String dest=".\\Screenshots\\"+ScreenshotName+".png";
			File destination= new File(dest);
			FileUtils.copyFile(src,destination);
			System.out.println("Screenshot captured");
			return dest;
			
			} catch (Exception e) {
			System.out.println(e.getMessage() + "while taking screenshot,");
			return e.getMessage();
		}
	}
}
