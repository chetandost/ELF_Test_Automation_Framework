package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_Page {
	
	
	public class FacebookPage extends Base_Tricentis_Page{
		
		public FacebookPage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath="//a[@aria-label=\'Facebook\']")
		public WebElement fb_logo;

		

	}

}
