package org.automation.element_repository;
import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class Motorcycle_page extends Base_Tricentis_Page{

		public Motorcycle_page(WebDriver driver) {
			super(driver);
			
		}

		
		@FindBy(id="selectedinsurance")
		public WebElement pageName;
		
		

	}



