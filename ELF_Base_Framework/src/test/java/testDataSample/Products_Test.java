package testDataSample;


import org.automation.base.Base_Test_Tricentis;
import org.automation.base.Base_Tricentis_Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Products_Test extends Base_Test_Tricentis{
	
	
	

	@Test
	public void assertproducts() {
		
		Base_Tricentis_Page basepage=new Base_Tricentis_Page(driver);
		
		basepage.getproducts_link().click();
		
		
	}

}
