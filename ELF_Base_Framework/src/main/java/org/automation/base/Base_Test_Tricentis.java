package org.automation.base;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Test.InvalidBrowserValueException;
import org.automation.element_repository.Home_Page;
import org.automation.element_repository.Login_Page;
import org.automation.generic_utilities.FrameworkConstants;
import org.automation.generic_utilities.InitObjects;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test_Tricentis extends InitObjects implements FrameworkConstants {
	
	
	/**
	 * 
	 * @author Chetan
	 *
	 */
		public static WebDriver driver;
		public ReadTestData readData;
		public WebDriverWait explicitWait;
		public InitObjects initClass;
		public Login_Page loginPage;
		public Home_Page homePage;
		public String url;
		public String emailId;
		public String password;

		/**
		 * This function performs the browser setup *
		 * 
		 * @param browserName this method receives the parameter from xml file and based
		 *                    on the value passed it will launch the respective browser,
		 *                    if browser name is not passed from xml file then it will
		 *                    try to take the value from property file with the key
		 *                    <b>browser</b>
		 * @throws InvalidBrowserValueException if browser value is not passed either
		 *                                      from xml or property file then it will
		 *                                      throw Invalid browser exception
		 */
		@Parameters("browser")
		@BeforeClass(alwaysRun = true)
		public void browserSetUp(@Optional("noValue") String browserName) throws InvalidBrowserValueException {
			readData = new ReadTestData();
			if (browserName.equalsIgnoreCase("noValue")) {
				browserName = readData.readDataFromPropertyFile("browser");
				if (browserName.equalsIgnoreCase("null")) {
					Reporter.log("Pass a valid browser name from Property file");
					throw new InvalidBrowserValueException();
				}
			} 
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				Reporter.log("Successfully Launched Chrome Browser", true);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				Reporter.log("Successfully Launched Firefox Browser", true);
			}
			driver.manage().window().maximize();
			driver.get(readData.readDataFromPropertyFile("url"));
			Reporter.log("Browser window is maximized successfully", true);
			driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
			explicitWait = new WebDriverWait(driver, EXPLICIT_TIMEOUT);
			initClass = new InitObjects();
		}
		
		/**
		 * this function stops the driver instance
		 */
		@AfterClass(alwaysRun = true)
		public void browserTearDown() {
			driver.quit();
		}

		

		

	// *****************************************************************************
	// ==============================Custom Exceptions==============================
	// *****************************************************************************

		@SuppressWarnings("serial")
		class InvalidBrowserValueException extends Exception {
			public InvalidBrowserValueException() {
				super("Please provide browser value either in XML file or property file");
			}
		}}






