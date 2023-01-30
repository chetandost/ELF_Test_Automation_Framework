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
public class Truck_Page extends Base_Tricentis_Page {

	public Truck_Page(WebDriver driver) {
		super(driver);
	}

	//================Web elements or Property================
	@FindBy(id="make") 
	WebElement please_select_dropdown;

	@FindBy(id="engineperformance") 
	WebElement engine_performance_textfield;

	@FindBy(id="dateofmanufacture") 
	WebElement dateofmanufacture_textfield;

	@FindBy(id="numberofseats") 
	WebElement numberofseats_dropdown;

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

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[1]")
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
	WebElement other_checkbox;			//24

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

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[3]")
	WebElement silver_radio;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[4]")
	WebElement gold_radio;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[5]")
	WebElement platinum_radio;

	@FindBy(xpath="(//span[contains(@class,'ideal-radio')])[6]")
	WebElement ultimate_radio;

	@FindBy(xpath="//button[@id='nextsendquote']")
	WebElement nextquotebutton;

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

	@FindBy(css ="button[class='confirm']")
	WebElement okpopup;

	@FindBy(xpath ="//h2")
	WebElement fetchtext;


	//================Getters or Public services================
	public WebElement getmakedropdown() {
		return please_select_dropdown;
	}

	public WebElement getengineperformance() {
		return engine_performance_textfield;
	}

	public WebElement getdateofmanufacture() {
		return dateofmanufacture_textfield;
	}

	public WebElement getnumberofseats() {
		return numberofseats_dropdown;
	}

	public WebElement getfuel() {
		return fuel_dropdown;
	}

	public WebElement getpayload() {
		return payload_textfield;
	}

	public WebElement gettotalweight() {
		return totalweight_textfield;
	}

	public WebElement getlistprice() {
		return listprice_textfield;
	}
	public WebElement getlicenseplatenumber() {
		return licenseplatenumber_textfield;
	}

	public WebElement getannualmileage() {
		return annualmileage_textfield;
	}
	public WebElement getnextenterinsurantdata() {
		return nextenterinsurantdata_button;
	}
	public WebElement getfirstname() {
		return firstname_textfield;
	}

	public WebElement getlastname() {
		return lastname_textfield;
	}

	public WebElement getbirthdate() {
		return birthdate_textfield;
	}

	public WebElement getgendermale() {
		return gendermale_radiobutton;
	}

	public WebElement getgenderfemale() {
		return genderfemale_radiobutton;
	}

	public WebElement getstreetaddress() {
		return streetaddress_textfield;
	}

	public WebElement getcountry() {
		return country_dropdown;
	}

	public WebElement getzipcode() {
		return zipcode_textfield;
	}

	public WebElement getcity() {
		return city_textfield;
	}

	public WebElement getoccupation() {
		return occupation_dropdown;
	}

	public WebElement getspeeding() {
		return speeding_checkbox;
	}

	public WebElement getbungeejumping() {
		return bungeejumping_checkbox;
	}

	public WebElement getcliffdiving() {
		return cliffdiving_checkbox;
	}
	public WebElement getskydiving() {
		return skydiving_checkbox;
	}

	public WebElement getother() {
		return other_checkbox;
	}

	public WebElement getwebsite() {
		return website_textfield;
	}

	public WebElement gettext() {
		return text_textfield;
	}

	public WebElement getopen() {
		return open_button;
	}

	public WebElement getnextenterproductdata() {
		return next_button;
	}

	public WebElement getpreventervehicledata() {
		return prev_button;
	}

	public WebElement getstartdate() {
		return startdate_textfield;
	}
	public WebElement getinsurancesum() {
		return insurancesum_dropdown;
	}

	public WebElement getdamageinsurance() {
		return damageinsurance_dropdown;
	}

	public WebElement getEuroProtection() {
		return EuroProtection_checkbox;
	}

	public WebElement getLegalDefenseInsurance() {
		return LegalDefenseInsurance_checkbox;
	}

	public WebElement getpreventerinsurancedata() {
		return preventerinsurancedata_button;
	}


	public WebElement getnextselectpriceoption() {
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

	public WebElement getNextsendquotebutton() {
		return nextquotebutton;
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

	public String getfetchtext() {
		return fetchtext.getText();
	}


	public void truckinsurance(String selectdropdown,String engine,String date,
			String numberofseats,String fuel,String payload,String totalweight,
			String list_price,String licenseplateno,String annual_mileage,
			String firstName,String lastName,String DOB,String gender,String streetaddress,
			String countrydropdown,String zipcode,String city,String occupation,
			String website,String startdate,String insurancesumdrop,String damageinsuranacedrop,
			String email,String phonenumber,String username,String password,
			String cnfpassword,String comments) throws InterruptedException {



		UtilityMethods util = new UtilityMethods();

		util.selectDropDown(getmakedropdown(), selectdropdown);

		getengineperformance().sendKeys(engine);

		getdateofmanufacture().sendKeys(date);

		util.selectDropDown(getnumberofseats(), numberofseats);

		util.selectDropDown(getfuel(), fuel);

		getpayload().sendKeys(payload);

		gettotalweight().sendKeys(totalweight);

		getlistprice().sendKeys(list_price);

		getlicenseplatenumber().sendKeys(licenseplateno);

		getannualmileage().sendKeys(annual_mileage);

		getnextenterinsurantdata().click();

		getfirstname().sendKeys(firstName);

		getlastname().sendKeys(lastName);

		getbirthdate().sendKeys(DOB);

		if(gender.equalsIgnoreCase("MALE")) 
			gendermale_radiobutton.click();
		else 
			genderfemale_radiobutton.click();


		getstreetaddress().sendKeys(streetaddress);


		util.selectDropDown(getcountry(), countrydropdown);

		getzipcode().sendKeys(zipcode);

		getcity().sendKeys(city);

		util.selectDropDown(getoccupation(), occupation);

		getspeeding().click();

		getbungeejumping().click();

		getcliffdiving().click();

		getskydiving().click();

		getother().click();

		getwebsite().sendKeys(website);

		//use robot class
		//getOpen_button().click();

		getnextenterproductdata().click();

		getstartdate().sendKeys(startdate);

		util.selectDropDown(getinsurancesum(), insurancesumdrop);

		util.selectDropDown(getdamageinsurance(),damageinsuranacedrop);

		getEuroProtection().click();

		getLegalDefenseInsurance().click();

		getnextselectpriceoption().click();

		getselectplatinum_Radiobutton().click();

		//getNextsendquotebutton().click();

		getsendquotebutton().click();

		getemail_Text_Field().sendKeys(email);

		getphn_Text_Field().sendKeys(phonenumber);

		getusername_Text_Field().sendKeys(username);

		getpassword_Text_Field().sendKeys(password);

		getconfirmpwd_Text_Field().sendKeys(cnfpassword);

		getcomments_Text_Field().sendKeys(comments);

		getsendemail_click().click();

	}

}


