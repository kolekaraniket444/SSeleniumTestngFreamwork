package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.HomePageObject;
import PageObjectModel.loginepageobject;
import Resourse.BaseClass;
import Resourse.common_method;
import Resourse.constants;

public class verifylogin extends BaseClass {

	@Test
	public void loginwithvaliddata() throws IOException, InterruptedException {
//		initializeDriver();  we use be fore method in base class 
//		driver.get("https://naveenautomationlabs.com/opencart/index.php");
//		driver.manage().window().maximize();

		HomePageObject hpo = new HomePageObject(driver);
		
		// commin common_method
		common_method.expliciteWait(driver, 10, hpo.clickmyaccount());
		
		hpo.clickmyaccount().click();
		hpo.clickonlogin().click();

		loginepageobject lpo = new loginepageobject(driver);

		lpo.enteruserid().sendKeys(emailadress);
		lpo.enterpassword().sendKeys("Aniket@123");
		lpo.clickonlogin().click();

		//common method
//		String acthualloginsucsess = lpo.loginsucsess().getText();
//		String expectedlogine="My Account";  //this store in constants
		
		common_method.handleassertion(lpo.loginsucsess().getText(),constants.expectedlogine);

	}

}
