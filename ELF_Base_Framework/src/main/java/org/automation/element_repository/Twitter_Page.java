package org.automation.element_repository;

import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Twitter_Page extends Base_Tricentis_Page {
	
	
	

	public Twitter_Page(WebDriver driver) {
		super(driver);
	}
		
		@FindBy(xpath="//span[text()='Log in']")
		public WebElement twitter_link;
		
		
		

	}


