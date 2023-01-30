package org.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author Chetan
 *
 */

public class Base_Tricentis_Page {

	public WebDriver driver;
	public Base_Tricentis_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//================Web elements or Property================
	@FindBy(linkText="Automobile") 
	 WebElement Automobile;

	@FindBy(linkText="Truck") 
	 WebElement Truck;

	@FindBy(linkText="Motorcycle") 
	 WebElement Motorcycle;

	@FindBy(linkText="Camper") 
	 WebElement Camper;

	@FindBy(linkText="Request Demo") 
	 WebElement Request_demo;

	@FindBy(id="search_form") 
	 WebElement search_support;

	@FindBy(id="search_button") 
	 WebElement search_button;

	@FindBy(id="nav_twitter")
	 WebElement twitter_link;
	
	@FindBy(xpath="//a[@name=\'About\']")
	 WebElement about_link;
	
	@FindBy(xpath="//a[text()='Products']")
	
	WebElement products_link;
	
	@FindBy(xpath="//a[@name=\'Events\']")
	
	WebElement events_link;
	
	@FindBy(id="tricentis_resources")
	WebElement resources_link;
	
	@FindBy(id="tricentis_services")
	
	WebElement services_link;
	
	@FindBy(id="nav_motorcycle")
	
	WebElement motorcycle_click;
	
	@FindBy(id="nav_automobile")
	
	WebElement automobile_click;
	
	@FindBy(id="nav_camper")
	
	WebElement camper_click;
	
	@FindBy(id="nav_truck")
	
	WebElement truck_click;
	
	@FindBy(id="visitsupport")
	
	WebElement support_click;
	
	@FindBy(id="search_form")
	
	WebElement search_textfield;
	
	@FindBy(xpath="//i[@class=\'fa fa-search\']")
	
	WebElement Search_button;
	
	@FindBy(xpath="//i[@class=\'fa fa-facebook\']")
	
	WebElement facebook_click;
	






	//================Getters or Public services================
	public WebElement getAutomobile() {
		return Automobile;
	}

	public WebElement getTruck() {
		return Truck;
	}

	public WebElement getMotorcycle() {
		return Motorcycle;
	}
	public WebElement getCamper() {
		return Camper;
	}
	public WebElement getRequestDemo() {
		return Request_demo;
	}

	public WebElement getsearch_form() {
		return search_support;

	}

	public WebElement getsearch_button() {
		return search_button;

	}

	public WebElement getnav_twitter() {

		return twitter_link ;
	}
	public WebElement getabout_link() {
		return about_link;
	}
	
	public WebElement getproducts_link() {
		return products_link;
	}
	
	public WebElement getevents_link() {
		return events_link;
	}
	
	public WebElement getresources_link() {
		return resources_link;
	}
	
	public WebElement getservices_link() {
		return services_link;
	}
	
	public WebElement getmotorcycle_click() {
		return motorcycle_click;
	}
	
	public WebElement getautomobile_click() {
		return automobile_click;
	}
	
	public WebElement getcamper_click() {
		return camper_click;
	}
	
	public WebElement gettruck_click() {
		return truck_click;
	}
	
	public WebElement getsupport_click() {
		return support_click;
	}
	
	public WebElement getsearch_textfield() {
		return search_textfield;
	}
	
	public WebElement getSearch_button() {
		return Search_button;
	}
	
	public WebElement getfacebook_click() {
		return facebook_click;
	}}

