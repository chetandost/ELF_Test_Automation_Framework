package testDataSample;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Tricentis_Page;
import org.automation.element_repository.Truck_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Truckdataprovider {
	
	
	public class TruckdataProvider {

		public ReadTestData readData;

		@DataProvider
		public String[][] truckdata() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
			readData = new ReadTestData();
			String[][] registerationData = readData.readAllDataFromExcel("Truck");
			return registerationData;
		}

		@Test(dataProvider="truckdata")
		public void truckInsurance(String [] registrationData) throws InterruptedException {
			String selectdropdown = registrationData[0];
			String engine = registrationData[1];
			String date = registrationData[2];
			String numberofseats = registrationData[3];
			String fuel = registrationData[4];
			String payload = registrationData[5];
			String totalweight = registrationData[6];
			String list_price = registrationData[7];
			String licenseplateno = registrationData[8];
			String annual_mileage = registrationData[9];
			String firstName = registrationData[10];
			String lastName = registrationData[11];
			String DOB = registrationData[12];
			String gender = registrationData[13];
			String streetaddress = registrationData[14];
			String countrydropdown = registrationData[15];
			String zipcode = registrationData[16];
			String city = registrationData[17];
			String occupation = registrationData[18];
			String website = registrationData[19];
			String startdate = registrationData[20];
			String insurancesumdrop = registrationData[21];
			String damageinsuranacedrop = registrationData[22];
			String email = registrationData[23];
			String phonenumber = registrationData[24];
			String username = registrationData[25];
			String password = registrationData[26];
			String cnfpassword = registrationData[27];
			String comments = registrationData[28];


			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(readData.readDataFromPropertyFile("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Base_Tricentis_Page btp = new Base_Tricentis_Page(driver);
			btp.getTruck().click();
			Truck_Page tp = new Truck_Page(driver);
			tp.truckinsurance(selectdropdown, engine, date, numberofseats, fuel, payload,
					totalweight, list_price, licenseplateno, annual_mileage, firstName, 
					lastName, DOB, gender, streetaddress, countrydropdown, zipcode, city, 
					occupation, website, startdate, insurancesumdrop, damageinsuranacedrop,
					email, phonenumber, username, password, cnfpassword, comments);
			driver.quit();

		}
	}

}


