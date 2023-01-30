package org.automation.element_repository;
import org.automation.base.Base_Tricentis_Page;
import org.automation.generic_utilities.UtilityMethods;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Request_demo  extends Base_Tricentis_Page{

		public Request_demo(WebDriver driver) {
			super(driver);
		}

		//======WebElement==========
		@FindBy(xpath ="//input[@name='Email']")
		WebElement Request_Demo_Email_textfield;

		@FindBy(id="FirstName")
		WebElement Request_Demp_FirstName_teXtfield;

		@FindBy(id="LastName")
		WebElement Request_Demp_LastName_teXtfield;

		@FindBy(id="Country")
		WebElement Request_Demp_Country_teXtfield;

		@FindBy(id="Phone")
		WebElement Request_Demp_Phone_teXtfield;

		@FindBy(id="Company")
		WebElement Request_Demp_Company_teXtfield;

		@FindBy(xpath="//select[@id='Role__c']")
		WebElement Request_Demp_Role_teXtfield;

		@FindBy(name="emailOptin")
		WebElement Agree_terms_request_Demo_checkbox;

		@FindBy(xpath="//span/button[contains(@class,'mktoButton')]/..")
		WebElement request_demo_button;

		@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
		WebElement cookies;



		//======methods========
		public WebElement getemail() {
			return Request_Demo_Email_textfield;
		}

		public WebElement getFirstname() {
			return Request_Demp_FirstName_teXtfield;
		}
		public WebElement getLastname() {
			return Request_Demp_LastName_teXtfield;
		}
		public WebElement getCountry() {
			return Request_Demp_Country_teXtfield;
		}
		public WebElement getphone() {
			return Request_Demp_Phone_teXtfield;
		}
		public WebElement getcompany() {
			return Request_Demp_Company_teXtfield;

		}
		public WebElement getrole() {
			return Request_Demp_Role_teXtfield;
		}
		public WebElement get_terms_and_condition() {
			return Agree_terms_request_Demo_checkbox;
		}
		public WebElement getbutton()
		{
			return request_demo_button;
		}

		public WebElement getcookies()
		{
			return cookies;
		}

		public void Request_Demo(String email,String firstname,String lastname,String country,String phone,String company,String role) {
			UtilityMethods ut=new UtilityMethods();
			Request_Demo_Email_textfield.sendKeys(email);
			Request_Demp_FirstName_teXtfield.sendKeys(firstname);
			Request_Demp_LastName_teXtfield.sendKeys(lastname);
			//Request_Demp_Country_teXtfield.sendKeys(country);
			ut.selectDropDown(Request_Demp_Country_teXtfield, country);
			Request_Demp_Phone_teXtfield.sendKeys(phone);
			Request_Demp_Company_teXtfield.sendKeys(company);
			ut.selectDropDown(Request_Demp_Role_teXtfield, role);
			Agree_terms_request_Demo_checkbox.click();
			getcookies().click();
			getbutton().click();


		}


	}



