package testDataSample;



import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Tricentis_Page;
import org.automation.element_repository.Motor_Cycle;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Motorcycledataprovider {
	
		public ReadTestData readData;
		
		@DataProvider
		public String[][] multipleNewUsersData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
			readData = new ReadTestData();
			String[][] registerationData = readData.readAllDataFromExcel("Motorcycle");
			return registerationData;
		}

		@Test(dataProvider="multipleNewUsersData")
		public void registerUser(String [] registrationData) {
			String vehiclename = registrationData[0];
			String modulename = registrationData[1];
			String cylindercapacity = registrationData[2];
			String engineperformance = registrationData[3];
			String date = registrationData[4];
			String seatvalue = registrationData[5];
			String price = registrationData[6];
			String mileage = registrationData[7];
			String firstname = registrationData[8];
			String lastname = registrationData[9];
			String DateofBirth = registrationData[10];
			String gender = registrationData[11];
			String address = registrationData[12];
			String country = registrationData[13];
			String zipcode = registrationData[14];
			String city = registrationData[15];
			String occupation = registrationData[16];
			String website = registrationData[17];
			String start_date = registrationData[18];
			String insurance_sum = registrationData[19];
			String Damage_Insurance = registrationData[20];
			String email = registrationData[21];
			String phone_number = registrationData[22];
			String Username = registrationData[23];
			String password = registrationData[24];
			String conformPwd = registrationData[25];
			String comments = registrationData[26];
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(readData.readDataFromPropertyFile("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Base_Tricentis_Page btp=new Base_Tricentis_Page(driver);
			btp.getMotorcycle().click();
			Motor_Cycle Page = new Motor_Cycle(driver) ;
	        Page.motorcycle(vehiclename, modulename, cylindercapacity, engineperformance, date, seatvalue,
	        		price, mileage, firstname, lastname, DateofBirth, gender, address, country, zipcode, 
	        		city, occupation, website, start_date, insurance_sum, Damage_Insurance, email, 
	        		phone_number, Username, password, conformPwd, comments);
			driver.quit();
		}
	}



	
	
	
	


