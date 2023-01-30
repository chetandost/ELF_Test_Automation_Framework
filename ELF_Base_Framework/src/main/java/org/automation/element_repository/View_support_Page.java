package org.automation.element_repository;

import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class View_support_Page extends Base_Tricentis_Page {

		public View_support_Page(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath="//h5[text()='Register']")
		public static WebElement registerLink;

	}


