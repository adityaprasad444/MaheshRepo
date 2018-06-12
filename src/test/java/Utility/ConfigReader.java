package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * ConfigReader.java - This class is used to read the config file and get values from properties file.
 * @author Nukala Mahesh
 * @version 1.7
 * Date - 12-19-2017	
 */

public class ConfigReader {
	Properties PRO;
	
	/**
	 * ConfigReader - This constructor is used to read the config file present in the path
	 * and loaded into PRO object
	 * @author Nukala Mahesh
	 * @version 1.7
	 * Date - 12-19-2017	
	 */
	public ConfigReader(){
		File src=new File("./Configuration/AppConfig.property");
		FileInputStream FIS;
		try {
			FIS = new FileInputStream(src);		
			PRO= new Properties();	
			PRO.load(FIS);
		} catch (Exception e) {
			
			System.out.println("Exception is: "+ e.getMessage());
		}
		
		
	}
	
	/**
	 * These methods are used to read the values mentioned in congig.properties file based on key value pair
	 * @return value present in properties file
	 * @author Nukala Mahesh
	 * @version 1.7
	 * Date - 12-19-2017	
	 */
	public String getChromePath(){
		return PRO.getProperty("ChromeDriver");
	}
	public String getApplicationURL(){
		return PRO.getProperty("URL");
	}
	public String getExcelPath(){
		return PRO.getProperty("ExcelPath");
	}
	public String getIePath(){
		return PRO.getProperty("IEDriver");
	}
	public String getUsernamePath(){
		return PRO.getProperty("UsernamePath");
	}
	public String getPasswordPath(){
		return PRO.getProperty("PasswordPath");
	}
	
	public String getSignInPath(){
		return PRO.getProperty("SignInPath");
	}
	public String getExcel2Path(){
		return PRO.getProperty("Excel2Path");
	}
	public String getMercurySignUpUrl(){
		return PRO.getProperty("MercurySignUpUrl");
	}
	
}
