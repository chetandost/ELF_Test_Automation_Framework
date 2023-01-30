package testDataSample;

import org.automation.base.Base_Test_Tricentis;
import org.automation.base.Base_Tricentis_Page;
import org.testng.annotations.Test;

public class Auto_mobile extends Base_Test_Tricentis{
		
		
		@Test
		public void auto() {

			
			Base_Tricentis_Page basepage=new Base_Tricentis_Page(driver);
			basepage.getautomobile_click().click();
		}}
		
		
