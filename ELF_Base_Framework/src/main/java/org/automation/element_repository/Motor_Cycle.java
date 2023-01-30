package org.automation.element_repository;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Tricentis_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * 
 * @author Chetan
 *
 */

public class Motor_Cycle extends Base_Tricentis_Page {


	//===========constructor=============
		public Motor_Cycle(WebDriver driver) {
			super(driver);
			
		}
		
		
		//=========WebElements============
		@FindBy(id="make")
		private WebElement Make_Dropdown;
		
		@FindBy(id="model")
		private WebElement Model_Dropdown;
		
		@FindBy(id="cylindercapacity")
		private WebElement CylinderCapacity_TextField;
		
		@FindBy(id="engineperformance")
		private WebElement Engine_Performance_TextField;
		
		@FindBy(id="dateofmanufacture")
		private WebElement Date_of_manufacture_TextField;
		
		@FindBy(id="numberofseatsmotorcycle")
		private WebElement Number_of_seats_Dropdown;
		
		@FindBy(id="fuel")
		private WebElement Fuel_Type_Dropdown;
		
		@FindBy(id="listprice")
		private WebElement List_Price_TextField;
		
		@FindBy(id="annualmileage")
		private WebElement Annual_Mileage_TextField;
		
		@FindBy(id="nextenterinsurantdata")
		private WebElement Login;
		
		
		
		
		//=========Methods==============
		public WebElement Make_Dropdown() {
			return Make_Dropdown;
		}
		
		public WebElement Model_Dropdown() {
			return Model_Dropdown;
		}
		
		public WebElement CylinderCapacity_TextField() {
			return CylinderCapacity_TextField;
		}
		
		public WebElement Engine_Performance_TextField() {
			return Engine_Performance_TextField;
		}
		
		public WebElement Date_of_manufacture_TextField() {
			return Date_of_manufacture_TextField;
		}
		
		public WebElement Number_of_seats_Dropdown() {
			return Number_of_seats_Dropdown;
		}
		
		public WebElement Fuel_Type_Dropdown() {
			return Fuel_Type_Dropdown;
		} 
		
		public WebElement List_Price_TextField() {
			return List_Price_TextField;
		}
		
		public WebElement Annual_Mileage_TextField() {
			return Annual_Mileage_TextField;
		}
		
		public WebElement Login() {
			return Login;
		}
		
	//===Enter_Vechicle_Data======Business Logic or Action methods or Behavior================
		public void Enter_vehicle_data(String vehiclename, String modulename,String cylindercapacity,String engineperformance,String date,String seatvalue,String price,String mileage) {
			UtilityMethods method=new UtilityMethods();
			method.selectDropDown(Make_Dropdown, vehiclename);
			method.selectDropDown(Model_Dropdown, modulename);
			CylinderCapacity_TextField.sendKeys(cylindercapacity);
			Engine_Performance_TextField.sendKeys(engineperformance);
			Date_of_manufacture_TextField.sendKeys(date);
			method.selectDropDown(Number_of_seats_Dropdown, seatvalue);
			List_Price_TextField.sendKeys(price);
			Annual_Mileage_TextField.sendKeys(mileage);
			Login.click();
		}
		
	//======================================================================================	
		//Enter Insurant Data
		
		//========WebElements=============
		@FindBy(id="firstname")
		private WebElement FirstName;
		
		@FindBy(id="lastname")
		private WebElement LastName;
		
		@FindBy(id="birthdate")
		private WebElement DateOfBirth_TextField;
		
		@FindBy(xpath="(//span[@class='ideal-radio'])[1]")
		private WebElement Male_radiobutton;
		
		@FindBy(xpath="(//span[@class='ideal-radio'])[2]")
		private WebElement Female_radiobutton;
		
		@FindBy(xpath="//input[@name='Street Address']")
		private WebElement Street_Adress_TextField;
		
		@FindBy(id="country")
		private WebElement Country_dropdown;
		
		@FindBy(id="zipcode")
		private WebElement Zipcode_TextField;
		
		@FindBy(id="city")
		private WebElement City_TextField;
		
		@FindBy(id="occupation")
		private WebElement Occupation_dropdown;
		
		@FindBy(xpath="(//span[@class='ideal-check'])[1]")
		private WebElement Speeding_Hobbies_radiobutton;

		@FindBy(xpath="//input[@value='BungeeJumping']")
		private WebElement Bungee_Jumping_radiobutton;
		
		@FindBy(xpath="//input[@value='CliffDiving']")
		private WebElement CliffDiving_radiobutton;
		
		@FindBy(xpath="//input[@value='Skydiving']")
		private WebElement Skydiving_radiobutton;
		
		@FindBy(xpath="//input[@value='Other']")
		private WebElement Other_radiobutton;
		
		@FindBy(id="website")
		private WebElement Website_TextField;
		
		@FindBy(id="nextenterproductdata")
		private WebElement Next_button;
		
		
		
		//=========Methods================
		public WebElement FirstName() {
			return FirstName;
		}
		
		public WebElement LastName() {
			return LastName;
		}
		
		public WebElement DateOfBirth_TextField() {
			return DateOfBirth_TextField;
		}
		
		public WebElement Male_radiobutton() {
			return Male_radiobutton;
		}
		
		public WebElement Female_radiobutton() {
			return Female_radiobutton;
		}
		
		public WebElement Street_Adress_TextField() {
			return Street_Adress_TextField;
		}
		
		public WebElement Country_dropdown() {
			return Country_dropdown;
		}
		
		public WebElement Zipcode_TextField() {
			return Zipcode_TextField;
		}
		
		public WebElement City_TextField() {
			return City_TextField;
		}
		
		public WebElement Occupation_dropdown() {
			return Occupation_dropdown;
		}
		
		public WebElement Speeding_Hobbies_dropdown() {
			return Speeding_Hobbies_radiobutton;
		}
		
		public WebElement Bungee_Jumping_dropdown() {
			return Bungee_Jumping_radiobutton;
		}
		
		public WebElement CliffDiving_dropdown() {
			return CliffDiving_radiobutton;
		}
		
		public WebElement Skydiving_dropdown() {
			return Skydiving_radiobutton;
		}
		
		public WebElement Other_dropdown() {
			return Other_radiobutton;
		}
		
		public WebElement Website_TextField() {
			return Website_TextField;
		}
		
		public WebElement Next_TextField() {
			return Next_button;
		}
		
		
	//===Enter_Insurant_Data======Business Logic or Action methods or Behavior================
		public void Enter_Insurant_Data(String firstname,String lastname,String DateofBirth,String address,String country,String zipcode,String city,String value,String value1,String website) {
			UtilityMethods method=new UtilityMethods();
			FirstName.sendKeys(firstname);
			LastName.sendKeys(lastname);
			DateOfBirth_TextField.sendKeys(DateofBirth);
			Male_radiobutton.click();
			Street_Adress_TextField.sendKeys(address);
			method.selectDropDown(Country_dropdown, country);
			Zipcode_TextField.sendKeys(zipcode);
			City_TextField.sendKeys(city);
			method.selectDropDown(Occupation_dropdown,value);
			Speeding_Hobbies_radiobutton.click();
			Website_TextField.sendKeys(website);
			Next_button.click();
		}	
		
	//==============================================================================================
		//==========================Enter Product Data==============================================
		//WebElements
		@FindBy(id="startdate")
		private WebElement Start_Date_TextField;
		
		@FindBy(id="insurancesum")
		private WebElement Insurance_Sum_Dropdown;
		
		@FindBy(id="damageinsurance")
		private WebElement Damage_Insurance_Dropdown;
		
		@FindBy(xpath="(//span[contains(@class,'ideal-check')])[6]")
		private WebElement EuroProtection_Radiobutton;
		
		@FindBy(xpath="//span[@class='ideal-check checked']")
		private WebElement LegalDefenseInsurance_Dropdown;
		
		@FindBy(id="nextselectpriceoption")
		private WebElement Next_Button;
		
		@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[1]")
		WebElement gendermale_radiobutton;

		@FindBy(xpath  ="(//span[contains(@class,'ideal-radio')])[2]") 
		WebElement genderfemale_radiobutton;

		
			
		//Methods
		public WebElement Start_Date_TextField() {
			return Start_Date_TextField;
		}
		
		public WebElement Insurance_Sum_Dropdown() {
			return Insurance_Sum_Dropdown;
		}
		
		public WebElement Damage_Insurance_Dropdown() {
			return Damage_Insurance_Dropdown;
		}
		
		public WebElement EuroProtection_Radiobutton() {
			return EuroProtection_Radiobutton;
		}
		
		public WebElement LegalDefenseInsurance_Dropdown() {
			return LegalDefenseInsurance_Dropdown;
		}
		
		public WebElement Next_Button() {
			return Next_Button;
		}	
		
		//===Enter_Insurant_Data======Business Logic or Action methods or Behavior================
		public void Enter_Insurant_Data(String start_date,String insurance_sum,String Damage_Insurance) {
		UtilityMethods methods=new UtilityMethods();
		Start_Date_TextField.sendKeys(start_date);
		methods.selectDropDown(Insurance_Sum_Dropdown, insurance_sum);
		methods.selectDropDown(Damage_Insurance_Dropdown, Damage_Insurance);
		EuroProtection_Radiobutton.click();
		Next_Button.click();
		}
		

	//======================================================================================	
		//Select Price Option
			
		//========WebElements=============
		@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[3]")
		private WebElement Silver_Radiobutton;	
			
		@FindBy(id="selectgold")
		private WebElement Gold_Radiobutton;
		
		@FindBy(id="selectplatinum")
		private WebElement Platinum_Radiobutton;
			
		@FindBy(id="selectultimate")
		private WebElement Ultimate_Radiobutton;
		
		@FindBy(id="nextsendquote")
		private WebElement next_Button;
			
			
			
		//Methods
		public WebElement Silver_Radiobutton() {
			return Silver_Radiobutton;
		}
			
		public WebElement Gold_Radiobutton() {
			return Gold_Radiobutton;
		}
			
		public WebElement Platinum_Radiobutton() {
			return Platinum_Radiobutton;
		}
			
		public WebElement Ultimate_Radiobutton() {
			return Ultimate_Radiobutton;
		}
		
		public WebElement next_Button() {
			return next_Button;
		}
			
			
			
	//===Select Price Option======Business Logic or Action methods or Behavior================
		public void Select_Price_Option() {
		Silver_Radiobutton.click();
		Gold_Radiobutton.click();
		Platinum_Radiobutton.click();
		Ultimate_Radiobutton.click();
		next_Button.click();
		}
			
		
	//======================================================================================	
	//Send Quote
				
	//========WebElements=============
		@FindBy(id="email")
		private WebElement Email_TextField;
		
		@FindBy(id="phone")
		private WebElement phone_number_TextField;
		
		@FindBy(id="username")
		private WebElement Username_TextField;
		
		@FindBy(id="password")
		private WebElement password_TextField;
		
		@FindBy(id="confirmpassword")
		private WebElement confirmpassword_TextField;
		
		@FindBy(id="Comments")
		private WebElement Comments_TextField;
		
		@FindBy(id="sendemail")
		private WebElement Send_Button;

	//=============Methods================
		public WebElement Email_TextField() {
			return Email_TextField;
		}
		
		public WebElement phone_number() {
			return phone_number_TextField;
		}
		
		public WebElement Username() {
			return Username_TextField;
		}
		
		public WebElement password() {
			return password_TextField;
		}
		
		public WebElement confirmpassword() {
			return confirmpassword_TextField;
		}
		
		public WebElement Comments() {
			return Comments_TextField;
		}
		
		public WebElement Send_Button() {
			return Send_Button;
		}
		
	//===Send Quote======Business Logic or Action methods or Behavior================
		public void Send_Quote(String email,String phone_number,String Username,String password,String conformPwd,String comments) {
		Email_TextField.sendKeys(email);
		phone_number_TextField.sendKeys(phone_number);
		Username_TextField.sendKeys(Username);
		password_TextField.sendKeys(password);
		confirmpassword_TextField.sendKeys(conformPwd);
		Comments_TextField.sendKeys(comments);
		Send_Button.click();
		}
		
	//===========Motorcycle method==================[complete method to run one complete system test]

	public void motorcycle(String vehiclename, String modulename,String cylindercapacity,String engineperformance,String date,String seatvalue,String price,String mileage,String firstname,String lastname,String DateofBirth,String gender,String address,String country,String zipcode,String city,String occupation,String website,String start_date,String insurance_sum,String Damage_Insurance,String email,String phone_number,String Username,String password,String conformPwd,String comments) {
		UtilityMethods method=new UtilityMethods();
		method.selectDropDown(Make_Dropdown, vehiclename);
		method.selectDropDown(Model_Dropdown, modulename);
		CylinderCapacity_TextField.sendKeys(cylindercapacity);
		Engine_Performance_TextField.sendKeys(engineperformance);
		Date_of_manufacture_TextField.sendKeys(date);
		method.selectDropDown(Number_of_seats_Dropdown, seatvalue);
		List_Price_TextField.sendKeys(price);
		Annual_Mileage_TextField.sendKeys(mileage);
		Login.click();
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		DateOfBirth_TextField.sendKeys(DateofBirth);
		if(gender.equalsIgnoreCase("MALE")) 
			gendermale_radiobutton.click();
		else 
			genderfemale_radiobutton.click();
		Street_Adress_TextField.sendKeys(address);
		method.selectDropDown(Country_dropdown, country);
		Zipcode_TextField.sendKeys(zipcode);
		City_TextField.sendKeys(city);
		method.selectDropDown(Occupation_dropdown,occupation);
		Speeding_Hobbies_radiobutton.click();
		Website_TextField.sendKeys(website);
		Next_button.click();
		Start_Date_TextField.sendKeys(start_date);
		method.selectDropDown(Insurance_Sum_Dropdown, insurance_sum);
		method.selectDropDown(Damage_Insurance_Dropdown, Damage_Insurance);
		EuroProtection_Radiobutton.click();
		Next_Button.click();
		Silver_Radiobutton.click();
		next_Button.click();
		Email_TextField.sendKeys(email);
		phone_number_TextField.sendKeys(phone_number);
		Username_TextField.sendKeys(Username);
		password_TextField.sendKeys(password);
		confirmpassword_TextField.sendKeys(conformPwd);
		Comments_TextField.sendKeys(comments);
		Send_Button.click();
	}
	}





