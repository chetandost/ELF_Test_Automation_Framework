package testDataSample;

import org.automation.base.Base_Test_Tricentis;
import org.automation.base.Base_Tricentis_Page;
import org.testng.annotations.Test;

public class Truck extends Base_Test_Tricentis{

		@Test
		public void A() {

			
			Base_Tricentis_Page basepage=new Base_Tricentis_Page(driver);
			
			basepage.gettruck_click().click();
			
		}

	}


