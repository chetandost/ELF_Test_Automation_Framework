package testDataSample;

import org.automation.base.Base_Test_Tricentis;
import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class campor extends Base_Test_Tricentis{

		

		@Test
		public void campor() {

			
			Base_Tricentis_Page basepage=new Base_Tricentis_Page(driver);
			basepage.getcamper_click().click();
			
		}

	}


