package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginepageobject {

	public WebDriver driver;

	private By userid = By.xpath("//input[@id='input-email']");
	private By userpassword = By.xpath("//input[@id='input-password']");
	private By clicklogine = By.xpath("//input[@value='Login']");
	
	//Assert
	private By loginsucsess =By.xpath("//h2[text()='My Account']");

	public loginepageobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement enteruserid() {
		return driver.findElement(userid);
	}

	public WebElement enterpassword() {
		return driver.findElement(userpassword);
	}

	public WebElement clickonlogin() {
		return driver.findElement(clicklogine);
	}
	//assert method
	public WebElement loginsucsess() {
		return driver.findElement(loginsucsess);
	}
}
