package org.automation.element_repository;

import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page_tricentis extends Base_Tricentis_Page {
	
	
	
	public Home_page_tricentis(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//img[@alt=\"Offer Automobile\"]")
	public WebElement auto_img;

	@FindBy(xpath="//img[@alt=\"Offer Truck\"]")
	public WebElement truck_img;


	@FindBy(xpath="//img[@alt=\"Offer Motorcycle\"]")
	public WebElement motorCycle_img;

	@FindBy(xpath="//img[@alt=\"Offer Camper\"]")
	public WebElement camper_img;


}
