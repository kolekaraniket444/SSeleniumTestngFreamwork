package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;

import PageObjectModel.HomePageObject;
import PageObjectModel.RagistrationPageObject;
import Resourse.BaseClass;
import Resourse.common_method;
import Resourse.constants;

public class verifyragistration extends BaseClass {

	@Test
	public void verifyragistrationpage() throws IOException, InterruptedException {
		// we use be fore method in base class

		HomePageObject hpo = new HomePageObject(driver);// need to import this is the class of page ob mod class name
														// home page object
		// pass driver in braket to homee class driver give shcope
		hpo.clickmyaccount().click();
		hpo.clickragister().click();

		RagistrationPageObject rpo = new RagistrationPageObject(driver);

		rpo.enterfirstname().sendKeys(constants.firstname);

		rpo.enterlastname().sendKeys(constants.lastname);

		rpo.enteremail().sendKeys(emailadress); // we can daynamic mail ganrate in base classs
												// System.currentTimeMillis()+"@gmail.com";

		rpo.enterphonenumber().sendKeys(constants.phonenumber);

		rpo.enterpassword().sendKeys(constants.password);

		rpo.entercomformpassword().sendKeys(constants.comformpassword);

		rpo.clickonrediobutton().click();
		rpo.clickonprivecypolicy().click();
		rpo.clickonsubmit().click();
		//explicite wait common_method
		common_method.expliciteWait(driver, 10, rpo.registrationsucsessfull());
		
		common_method.handleassertion(rpo.registrationsucsessfull().getText(), constants.regisucsess_ecsepted);

//		SoftAssert sa = new SoftAssert();
//		String registrationexpected =constants.regisucsess_ecsepted;
//		String registratioacthual = rpo.registrationsucsessfull().getText();
//		sa.assertEquals(registratioacthual, registrationexpected);
//		sa.assertAll();

	}
	

	@Test
	public void verifyregestrationblankdetails() throws IOException {

		HomePageObject hpo = new HomePageObject(driver);
		hpo.clickmyaccount().click();
		hpo.clickragister().click();

		RagistrationPageObject rpo = new RagistrationPageObject(driver);
		rpo.clickonsubmit().click();
		
		common_method.handleassertion(rpo.acthualfirstnameerror().getText(), constants.firstnameerrordetails);
		common_method.handleassertion(rpo.acthuallastnameerror().getText(), constants.lastnameerrordetails);
		common_method.handleassertion(rpo.acthualemailnameerror().getText(), constants.emailerrordetails);
		common_method.handleassertion(rpo.acthualphonenameerror().getText(), constants.phoneerrordetails);
		common_method.handleassertion(rpo.acthualpassworderror().getText(), constants.passworderrordetails);

//		SoftAssert sa = new SoftAssert();
//		String acthualfirstname = rpo.acthualfirstnameerror().getText();
//		String expectedfirstname = "First Name must be between 1 and 32 characters!";
//		sa.assertEquals(acthualfirstname, expectedfirstname);
//		String acthuallastname = rpo.acthuallastnameerror().getText();
//		String expectedlastname = "Last Name must be between 1 and 32 characters!";
//		sa.assertEquals(acthuallastname, expectedlastname);
//		String acthualemailname = rpo.acthualemailnameerror().getText();
//		String expectedemailname = "E-Mail Address does not appear to be valid!";
//		sa.assertEquals(acthualemailname, expectedemailname);
//		String acthualphonename = rpo.acthualphonenameerror().getText();
//		String expectedphonename = "Telephone must be between 3 and 32 characters!";
//		sa.assertEquals(acthualemailname, expectedemailname);
//		String acthualpasswordname = rpo.acthualpassworderror().getText();
//		String expectedpasswordname = "Password must be between 4 and 20 characters!";
//		sa.assertEquals(acthualpasswordname, expectedpasswordname);
//		sa.assertAll();

	}

}
