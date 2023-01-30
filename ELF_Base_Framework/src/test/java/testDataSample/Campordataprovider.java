package testDataSample;

import org.automation.base.Base_Tricentis_Page;
import org.automation.element_repository.Campor_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Campordataprovider {
	
	public ReadTestData readData;
		
		@DataProvider
		public String[][] CamporData() throws InvalidTestCaseIdException, CheckExecutionRowException, InvalidExecutionColumnException{
			readData = new ReadTestData();
			String[][] registerationData = readData.readAllDataFromExcel("campor");
			return registerationData;
		}
		
		
		
		@Test(dataProvider = "CamporData")
		public void CamperInsurance(String [] registeration) {
			
			String selectdropdown= registeration[0];
			String engine = registeration[1];
			String	date = registeration[2];
			String	numberofseats = registeration[3];
			String	fuel = registeration[4];
			String payload=registeration[5];
			String totalweight=registeration[6];
			String	list_price = registeration[7];
			String	licenseplateno= registeration[8];
			String	annual_mileage=registeration[9];
			String  firstName= registeration[10];
			String  lastName= registeration[11];
			String  DOB= registeration[12];
			String  gender= registeration[13];
			String  streetaddress= registeration[14];
			String countrydropdown= registeration[15];
			String zipcode=registeration[16];
			String city=  registeration[17];
			String occupation=registeration[18];
			String	website=registeration[19];
			String startdate=registeration[20];
			String	insurancesumdrop=registeration[21];
			String	damageinsuranacedrop=registeration[22];
			String email= registeration[23];
			String phoneno= registeration[24];
			String username= registeration[25];
			String password= registeration[26];
			String confirmpassword= registeration[27];
			String comments= registeration[28];
					
					
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get(readData.readDataFromPropertyFile("url"));
			
			Base_Tricentis_Page basepage = new Base_Tricentis_Page(driver);
			basepage.getCamper().click();
			Campor_Page camper =new Campor_Page(driver);
			camper.CamperInsurance(selectdropdown, engine, date, numberofseats,
					fuel, payload, totalweight, list_price, licenseplateno, annual_mileage, firstName, lastName,
					DOB, gender, streetaddress, countrydropdown, zipcode, city,
					occupation, website, startdate, insurancesumdrop, damageinsuranacedrop,
					email, phoneno, username, password, confirmpassword, comments);
			
			//driver.quit();
			

	}
	}


