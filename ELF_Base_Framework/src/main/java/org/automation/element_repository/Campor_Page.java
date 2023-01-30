package org.automation.element_repository;

import org.automation.base.Base_Test_Tricentis;
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

public class Campor_Page extends Base_Tricentis_Page {
	
	public Campor_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="make") 
	 WebElement please_select_dropdown;

	@FindBy(id="engineperformance") 
	 WebElement engine_performance_textfield;

	@FindBy(id="dateofmanufacture") 
	 WebElement dateofmanufacture_textfield;

	@FindBy(id="numberofseats") 
	 WebElement numberofseats_dropdown;
	
	@FindBy(xpath = "//span[@class=\"ideal-radio\"]")
	 WebElement Right_Hand_Drive_Radio; 

	@FindBy(id="fuel") 
	 WebElement fuel_dropdown;

	@FindBy(id="payload") 
	 WebElement payload_textfield;
	
	@FindBy(id="totalweight") 
	 WebElement totalweight_textfield;
	
	@FindBy(id="listprice") 
	 WebElement listprice_textfield;

	@FindBy(id="licenseplatenumber") 
	 WebElement licenseplatenumber_textfield;

	@FindBy(id="annualmileage") 
	 WebElement annualmileage_textfield;

	@FindBy(id="nextenterinsurantdata") 
	 WebElement nextenterinsurantdata_button;

	@FindBy(id="firstname") 
	 WebElement firstname_textfield;

	@FindBy(id="lastname") 
	 WebElement lastname_textfield;

	@FindBy(id="birthdate") 
	 WebElement birthdate_textfield;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[3]")
	 WebElement gendermale_radiobutton;
	
	@FindBy(xpath  ="(//span[contains(@class,'ideal-radio')])[2]")
	 WebElement genderfemale_radiobutton;

	@FindBy(id="streetaddress") 
	 WebElement streetaddress_textfield;

	@FindBy(id="country") 
	 WebElement country_dropdown;

	@FindBy(id="zipcode") 
	 WebElement zipcode_textfield;

	@FindBy(id="city") 
	 WebElement city_textfield;

	@FindBy(id="occupation") 
	 WebElement occupation_dropdown;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[1]") 
	WebElement speeding_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[2]") 
	WebElement bungeejumping_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[3]") 
	WebElement cliffdiving_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[4]") 
	WebElement skydiving_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[5]") 
	WebElement other_checkbox;	

	@FindBy(id="website") 
	 WebElement website_textfield;

	@FindBy(id="text") 
	 WebElement text_textfield;

	@FindBy(id="open") 
	 WebElement open_button;

	@FindBy(id="nextenterproductdata") 
	 WebElement next_button;

	@FindBy(id="preventervehicledata") 
	 WebElement prev_button;

	@FindBy(id="startdate") 
	 WebElement startdate_textfield;

	@FindBy(id="insurancesum") 
	 WebElement insurancesum_dropdown;

	@FindBy(id="damageinsurance") 
	 WebElement damageinsurance_dropdown;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[6]")
	 WebElement EuroProtection_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[7]") 
	 WebElement LegalDefenseInsurance_checkbox;

	@FindBy(id="preventerinsurancedata") 
	 WebElement preventerinsurancedata_button;
	
	@FindBy(id="nextselectpriceoption") 
	 WebElement nextselectpriceoption_button;
	
	@FindBy(className="choosePrice ideal-radiocheck-label")
	 WebElement Select_price_option;
	
	
	
	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[5]")
	 WebElement platinum_radio;
	
	@FindBy(className="fa fa-file-pdf-o")
	WebElement Download_quote;
	
	@FindBy(xpath="//button[@id='nextsendquote']")
	WebElement Select_price_option_next;
	
	@FindBy(xpath = "//a[@id=\"sendquote\"]")
	WebElement sendquote;
	
	
	@FindBy(name="E-Mail")
	WebElement email_Text_Field;
	
	@FindBy(id="phone")
	WebElement phn_Text_Field;
	
	@FindBy(id="username")
	WebElement username_Text_Field;
	
	@FindBy(id="password")
	WebElement password_Text_Field;
	
	@FindBy(id="confirmpassword")
	WebElement confirmpwd_Text_Field;
	
	@FindBy(id="Comments")
	WebElement comments_Text_Field;
	
	@FindBy(id="sendemail")
	WebElement sendemail_click;
	
	@FindBy(id="prevselectpriceoption")
	WebElement prev_selectpriceoption;
	
	@FindBy(id="preventerinsurancedata")
	WebElement prev_enter_insurancedata;
	
	@FindBy(id="preventervehicledata")
	WebElement prev_enter_vehicle_data;
	


	//================Getters or Public services================
	//32
	public WebElement getSelect_make_dropdown() {
		return please_select_dropdown;
	}
	//1
	public WebElement getEngineperformance_textfield() {
		return engine_performance_textfield;		//1
	}
	//2
	public WebElement getDateofmanufacture_textfield() {
		return dateofmanufacture_textfield;
	}
	//3
	public WebElement getNumberofseats_dropdown() {
		return numberofseats_dropdown;
	}

	public WebElement getRight_Hand_Drive_Radio() {
		return Right_Hand_Drive_Radio;
	}
	//4
	public WebElement getFuel_dropdown() {
		return fuel_dropdown;
	}
	//5
	public WebElement getpayload() {
		return payload_textfield;
	}
	//6
	public WebElement gettotalweight() {
		return totalweight_textfield;
	}
	//7
	public WebElement getListprice_textfield() {
		return listprice_textfield;
	}
	//8
	public WebElement getLicenseplatenumber_textfield() {
		return licenseplatenumber_textfield;
	}
	//9
	public WebElement getAnnualmileage_textfield() {
		return annualmileage_textfield;
	}

	public WebElement getNextenterinsurantdata_button() {
		return nextenterinsurantdata_button;
	}
	//10
	public WebElement getFirstname_textfield() {
		return firstname_textfield;
	}
	//11
	public WebElement getLastname_textfield() {
		return lastname_textfield;
	}

	//12
	public WebElement getBirthdate_textfield() {
		return birthdate_textfield;
	}
	//13
	public WebElement getGendermale_radiobutton() {
		return gendermale_radiobutton;
	}
	//14
	public WebElement getGenderfemale_radiobutton() {
		return genderfemale_radiobutton;
	}
	//15
	public WebElement getStreetaddress_textfield() {
		return streetaddress_textfield;
	}
	//16
	public WebElement getCountry_dropdown() {
		return country_dropdown;
	}
	//17
	public WebElement getZipcode_textfield() {
		return zipcode_textfield;
	}
	//18
	public WebElement getCity_textfield() {
		return city_textfield;
	}
	//19
	public WebElement getOccupation_textfield() {
		return occupation_dropdown;
	}

	public WebElement getSpeeding_checkbox() {
		return speeding_checkbox;
	}

	public WebElement getBungeejumping_checkbox() {
		return bungeejumping_checkbox;
	}

	public WebElement getCliffdiving_checkbox() {
		return cliffdiving_checkbox;
	}
	public WebElement getSkydiving_checkbox() {
		return skydiving_checkbox;
	}

	public WebElement getOther_checkbox() {
		return other_checkbox;
	}
	//20
	public WebElement getWebsite_textfield() {
		return website_textfield;
	}
	//21
	public WebElement getPicture_textfield() {
		return text_textfield;
	}

	public WebElement getOpen_button() {
		return open_button;
	}

	public WebElement getNextenterproductdata_button() {
		return next_button;
	}

	public WebElement getPreventervehicledata_button() {
		return prev_button;
	}
	//22	
	public WebElement getStartdate_textfield() {
		return startdate_textfield;
	}
	//23
	public WebElement getInsurancesum_dropdown() {
		return insurancesum_dropdown;
	}

	//24
	public WebElement getDamageinsurance_dropdown() {
		return damageinsurance_dropdown;
	}


	public WebElement getEuroProtection_checkbox() {
		return EuroProtection_checkbox;
	}

	public WebElement getLegalDefenseInsurance_checkbox() {
		return LegalDefenseInsurance_checkbox;
	}


	public WebElement getPreventerinsurancedata_button() {
		return preventerinsurancedata_button;
	}

	public WebElement getNextselectpriceoption_button() {
		return nextselectpriceoption_button;
	}

	public WebElement getSelectpriceoption() {
		return Select_price_option;
	}

	public WebElement getselectplatinum_Radiobutton() {
		//return platinum_radio;
		return platinum_radio;
	}
	public WebElement getDownloadQuote() {
		return Download_quote;
	}
	public WebElement getsendquote_button() {
		return sendquote;
	}
	
	public WebElement getnextsendquote_button() {
		return Select_price_option_next;
	}
	
	
	//25
	public WebElement getemail_Text_Field() {
		return email_Text_Field ;
	}
	//26
	public WebElement getphnone_Text_Field() {
		return phn_Text_Field;
	}
	//27
	public WebElement getusername_Text_Field() {
		return username_Text_Field;
	}
	//28
	public WebElement getpassword_Text_Field() {
		return password_Text_Field;
	}
	//29
	public WebElement getconfirmpwd_Text_Field() {
		return confirmpwd_Text_Field;
	}
	//30
	public WebElement getcomments_Text_Field() {
		return comments_Text_Field;
	}
	//31
	public WebElement getsend_click() {
		return sendemail_click;
	}
	public WebElement getprev_select_priceoption() {
		return prev_selectpriceoption;
	}
	public WebElement getprev_enter_insurance() {
		return prev_enter_insurancedata;
	}

	public WebElement getprev_enter_vehicle_data() {
		return prev_enter_vehicle_data;
	}

		   
			
			//================Business Logic or Action methods or Behavior================

			public void CamperInsurance(String selectdropdown,String engine,String date,String numberofseats,String fuel,String payload,String totalweight,String list_price,
					String licenseplateno,String annual_mileage,String firstName,String lastName,String DOB,String gender,String streetaddress,
					String countrydropdown,String zipcode,String city,String occupation,String website,String startdate,String insurancesumdrop,
					String damageinsuranacedrop,String email,String phoneno,String username,String password,String confirmpassword,String comments) {


				UtilityMethods util = new UtilityMethods();

				util.selectDropDown(getSelect_make_dropdown(), selectdropdown);
				getEngineperformance_textfield().sendKeys(engine);
				getDateofmanufacture_textfield().sendKeys(date);
				util.selectDropDown(getNumberofseats_dropdown(), numberofseats);
				getRight_Hand_Drive_Radio().click();
				util.selectDropDown(getFuel_dropdown(), fuel);
				getpayload().sendKeys(payload);
				gettotalweight().sendKeys(totalweight);
				getListprice_textfield().sendKeys(list_price);
				getLicenseplatenumber_textfield().sendKeys(licenseplateno);
				getAnnualmileage_textfield().sendKeys(annual_mileage);
				getNextenterinsurantdata_button().click();
				
				
				getFirstname_textfield().sendKeys(firstName);
				getLastname_textfield().sendKeys(lastName);
				getBirthdate_textfield().sendKeys(DOB);
				if(gender.equalsIgnoreCase("MALE")) 
					gendermale_radiobutton.click();
				else 
					genderfemale_radiobutton.click();

				getStreetaddress_textfield().sendKeys(streetaddress);
				util.selectDropDown(getCountry_dropdown(), countrydropdown);
				getZipcode_textfield().sendKeys(zipcode);
				getCity_textfield().sendKeys(city);
				util.selectDropDown(getOccupation_textfield(), occupation);
				getSpeeding_checkbox().click();
				getBungeejumping_checkbox().click();
				getCliffdiving_checkbox().click();
				getSkydiving_checkbox().click();
				getOther_checkbox().click();
				getWebsite_textfield().sendKeys(website);
				//use robot class
				//getOpen_button().click();
				getNextenterproductdata_button().click();
				
				
				getStartdate_textfield().sendKeys(startdate);
				util.selectDropDown(getInsurancesum_dropdown(), insurancesumdrop);
				util.selectDropDown(getDamageinsurance_dropdown(),damageinsuranacedrop);
				getEuroProtection_checkbox().click();
				getLegalDefenseInsurance_checkbox().click();
				getNextselectpriceoption_button().click();
				getselectplatinum_Radiobutton().click();
				//getselectplatinum_Radiobutton().click();
				getsendquote_button().click();
				getemail_Text_Field().sendKeys(email);
				getphnone_Text_Field().sendKeys(phoneno);
				getusername_Text_Field().sendKeys(username);
				getpassword_Text_Field().sendKeys(password);
				getconfirmpwd_Text_Field().sendKeys(confirmpassword);
				getcomments_Text_Field().sendKeys(comments);
				getsend_click().click();
			}	   
}

