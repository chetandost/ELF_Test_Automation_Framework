package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Tricentis_Page;
import org.automation.element_repository.Request_demo;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Request_demo_dataprovider {

		public ReadTestData readData;

		@DataProvider
		public String[][] requestdemodata(){
			readData =new ReadTestData();
			String[][] RequestDemo=readData.readAllDataFromExcel("RequestDemo");
			return RequestDemo;

		}
		@Test(dataProvider="requestdemodata")
		public void requestdemo(String []requestdemodata ) {
			String email=requestdemodata[0];
			String firstnaame=requestdemodata[1];
			String lastname=requestdemodata[2];
			String country=requestdemodata[3];
			String phone=requestdemodata[4];
			String company=requestdemodata[5];
			String role=requestdemodata[6];
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(readData.readDataFromPropertyFile("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			UtilityMethods ut=new UtilityMethods(); 
			Request_demo rdp=new Request_demo(driver);
			String title="Tricentis Tosca Continuous Testing Platform Demo";	
			Base_Tricentis_Page bpt=new Base_Tricentis_Page(driver);
			//bpt.getRequestLink().click();
			//ut.switchToASpecificTitledWindow(driver, role);
			ut.switchToASpecificTitledWindow(driver,title);

			rdp.Request_Demo(email, firstnaame, lastname, country, phone, company, role);

		}
	}


