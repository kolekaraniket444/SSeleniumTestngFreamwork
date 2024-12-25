package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject { // we store xpath
	
	public WebDriver driver;                    // this driver is null we ned to give value we need to give scope
	
	private By myaccount = By.xpath("//span[text()='My Account']");
	private By ragistar =By.xpath("//a[text()='Register']");
	
	private By login =By.xpath("//a[text()='Login']");
	
	public HomePageObject(WebDriver driver) {//this driver come from verify registration with taking scope of base class ** public webd dri give sope
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement clickmyaccount() {
		return driver.findElement(myaccount);
	}
	
	public WebElement clickragister() {
		return driver.findElement(ragistar);
	}
	public WebElement clickonlogin() {
		return driver.findElement(login);
	}

}
