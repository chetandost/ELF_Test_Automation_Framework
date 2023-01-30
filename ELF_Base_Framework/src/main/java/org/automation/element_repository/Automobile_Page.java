package org.automation.element_repository;

import java.util.concurrent.TimeUnit;

import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.automation.base.Base_Tricentis_Page;
import org.automation.element_repository.Automobile_Page;
import org.automation.generic_utilities.ReadTestData;
import org.automation.generic_utilities.ReadTestData.CheckExecutionRowException;
import org.automation.generic_utilities.ReadTestData.InvalidExecutionColumnException;
import org.automation.generic_utilities.ReadTestData.InvalidTestCaseIdException;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Chetan
 *
 */

public class Automobile_Page extends Base_Tricentis_Page {


	public Automobile_Page(WebDriver driver) {
		super(driver);
	}

	
	
	
	//================Web elements or Property================
	@FindBy(id = "make") 
	WebElement select_make_dropdown;

	@FindBy(id = "engineperformance") 
	WebElement engineperformance_textfield;

	@FindBy(id  ="dateofmanufacture") 
	WebElement dateofmanufacture_textfield;

	@FindBy(id  ="numberofseats") 
	WebElement numberofseats_dropdown;

	@FindBy(id  ="fuel") 
	WebElement fuel_dropdown;

	@FindBy(id  ="listprice") 
	WebElement listprice_textfield;

	@FindBy(id  ="licenseplatenumber") 
	WebElement licenseplatenumber_textfield;

	@FindBy(id  ="annualmileage") 
	WebElement annualmileage_textfield;	


	@FindBy(id  ="nextenterinsurantdata") 
	WebElement nextenterinsurantdata_button;

	@FindBy(id  ="firstname") 
	WebElement firstname_textfield;

	@FindBy(id  ="lastname") 
	WebElement lastname_textfield;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[1]")
	WebElement gendermale_radiobutton;

	@FindBy(id ="birthdate") 
	WebElement birthdate_textfield;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-radio')])[2]") 
	WebElement genderfemale_radiobutton;

	@FindBy(id  ="streetaddress") 
	WebElement streetaddress_textfield;

	@FindBy(id  ="country") 
	WebElement country_dropdown;		

	@FindBy(id  ="zipcode") 
	WebElement zipcode_textfield;

	@FindBy(id  ="city") 
	WebElement city_textfield;

	@FindBy(id  ="occupation") 
	WebElement occupation_textfield;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[1]") 
	WebElement speeding_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[2]") 
	WebElement bungeejumping_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[3]") 
	WebElement cliffdiving_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[4]") 
	WebElement skydiving_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[5]") 
	WebElement other_checkbox;			//24

	@FindBy(id  ="website") 
	WebElement website_textfield;

	@FindBy(id  ="picture") 
	WebElement picture_textfield;

	@FindBy(id  ="open") 
	WebElement open_button;

	@FindBy(id  ="preventervehicledata") 
	WebElement preventervehicledata_button;

	@FindBy(id  ="nextenterproductdata") 
	WebElement nextenterproductdata_button;

	@FindBy(id  ="startdate") 
	WebElement startdate_textfield;

	@FindBy(id  ="insurancesum") 
	WebElement insurancesum_dropdown;

	@FindBy(id  ="meritrating") 
	WebElement meritrating_dropdown;		

	@FindBy(id  ="damageinsurance") 
	WebElement damageinsurance_dropdown;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[6]")
	WebElement EuroProtection_checkbox;

	@FindBy(xpath  ="(//span[contains(@class,'ideal-check')])[7]")
	WebElement LegalDefenseInsurance_checkbox;

	@FindBy(id = "courtesycar")
	WebElement courtesycar_dropdown;

	@FindBy(id = "preventerinsurancedata")
	WebElement preventerinsurancedata_button;

	@FindBy(id = "nextselectpriceoption")
	WebElement nextselectpriceoption_button;	

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[3]")
	WebElement silver_radio;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[4]")
	WebElement gold_radio;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[5]")
	WebElement platinum_radio;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[6]")
	WebElement ultimate_radio;
	
	@FindBy(id="sendquote")
	WebElement sendquotebutton;
	
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

	public WebElement getPleaseSelectDropdown() {
		return select_make_dropdown;
	}

	public WebElement getEngineperformance_textfield() {
		return engineperformance_textfield;
	}

	public WebElement getDateofmanufacture_textfield() {
		return dateofmanufacture_textfield;
	}


	public WebElement getNumberofseats_dropdown() {
		return numberofseats_dropdown;
	}

	public WebElement getFuel_dropdown() {
		return fuel_dropdown;
	}

	public WebElement getListprice_textfield() {
		return listprice_textfield;
	}												

	public WebElement getLicenseplatenumber_textfield() {
		return licenseplatenumber_textfield;
	}

	public WebElement getAnnualmileage_textfield() {
		return annualmileage_textfield;
	}

	public WebElement getNextenterinsurantdata_button() {
		return nextenterinsurantdata_button;
	}

	public WebElement getFirstname_textfield() {
		return firstname_textfield;
	}

	public WebElement getLastname_textfield() {
		return lastname_textfield;
	}

	public WebElement getGendermale_radiobutton() {			
		return gendermale_radiobutton;
	}

	public WebElement getGenderfemale_radiobutton() {
		return genderfemale_radiobutton;
	}

	public WebElement getBirthdate_textfield() {
		return birthdate_textfield;
	}

	public WebElement getStreetaddress_textfield() {
		return streetaddress_textfield;
	}

	public WebElement getCountry_dropdown() {
		return country_dropdown;
	}

	public WebElement getZipcode_textfield() {
		return zipcode_textfield;
	}

	public WebElement getCity_textfield() {
		return city_textfield;
	}

	public WebElement getOccupation_textfield() {		
		return occupation_textfield;
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

	public WebElement getWebsite_textfield() {			
		return website_textfield;
	}

	public WebElement getPicture_textfield() {
		return picture_textfield;
	}

	public WebElement getOpen_button() {
		return open_button;
	}

	public WebElement getPreventervehicledata_button() {
		return preventervehicledata_button;
	}

	public WebElement getNextenterproductdata_button() {
		return nextenterproductdata_button;
	}

	public WebElement getStartdate_textfield() {
		return startdate_textfield;
	}

	public WebElement getInsurancesum_dropdown() {			
		return insurancesum_dropdown;
	}

	public WebElement getMeritrating_dropdown() {
		return meritrating_dropdown;
	}

	public WebElement getDamageinsurance_dropdown() {
		return damageinsurance_dropdown;
	}

	public WebElement getEuroProtection_checkbox() {
		return EuroProtection_checkbox;
	}

	public WebElement getLegalDefenseInsurance_checkbox() {
		return LegalDefenseInsurance_checkbox;
	}

	public WebElement getCourtesycar_dropdown() {
		return courtesycar_dropdown;
	}

	public WebElement getPreventerinsurancedata_button() {		
		return preventerinsurancedata_button;
	}

	public WebElement getNextselectpriceoption_button() {		
		return nextselectpriceoption_button;

	}

	public WebElement getselectSilver_Radiobutton() {
		return silver_radio;
	}

	public WebElement getselectUltimate_Radiobutton() {
		return ultimate_radio;
	}

	public WebElement getselectGold_Radiobutton() {
		return gold_radio;
	}

	public WebElement getselectplatinum_Radiobutton() {
		return platinum_radio;
	}
	
	public WebElement getsendquotebutton() {
		return sendquotebutton;
	}


	public WebElement getemail_Text_Field() {
		return email_Text_Field ;
	}

	public WebElement getphn_Text_Field() {
		return phn_Text_Field;
	}

	public WebElement getusername_Text_Field() {
		return username_Text_Field;
	}
	public WebElement getpassword_Text_Field() {
		return password_Text_Field;
	}
	public WebElement getconfirmpwd_Text_Field() {
		return confirmpwd_Text_Field;
	}
	public WebElement getcomments_Text_Field() {
		return comments_Text_Field;
	}
	public WebElement getsendemail_click() {
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


	public void automobileInsurance(String selectdropdown,String engine,String date,String numberofseats,String fuel,String list_price,
			String licenseplateno,String annual_mileage,String firstName,String lastName,String DOB,String gender,String streetaddress,
			String countrydropdown,String zipcode,String city,String occupation,String website,String startdate,String insurancesumdrop,
			String meritratedrop,String damageinsuranacedrop, String courtesycardrop,String email,String phonenumber,String username,String password,
			String cnfpassword,String comments) {



		UtilityMethods util = new UtilityMethods();

		util.selectDropDown(getPleaseSelectDropdown(), selectdropdown);

		getEngineperformance_textfield().sendKeys(engine);

		getDateofmanufacture_textfield().sendKeys(date);

		util.selectDropDown(getNumberofseats_dropdown(), numberofseats);

		util.selectDropDown(getFuel_dropdown(), fuel);

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

		util.selectDropDown(getMeritrating_dropdown(), meritratedrop);

		util.selectDropDown(getDamageinsurance_dropdown(),damageinsuranacedrop);

		getEuroProtection_checkbox().click();

		getLegalDefenseInsurance_checkbox().click();

		util.selectDropDown(getCourtesycar_dropdown(), courtesycardrop);

		getNextselectpriceoption_button().click();

		getselectplatinum_Radiobutton().click();
		
		getsendquotebutton().click();

		getemail_Text_Field().sendKeys(email);

		getphn_Text_Field().sendKeys(phonenumber);

		getusername_Text_Field().sendKeys(username);

		getpassword_Text_Field().sendKeys(password);

		getconfirmpwd_Text_Field().sendKeys(cnfpassword);

		getcomments_Text_Field().sendKeys(comments);

		getsendemail_click().click();
}}




