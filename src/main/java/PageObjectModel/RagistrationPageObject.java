package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RagistrationPageObject {
	
	public WebDriver driver;
	
	private By firstname = By.xpath("//input[@id='input-firstname']");
	private By lastname  = By.xpath("//input[@id='input-lastname']");
	private By email  =By.xpath("//input[@id='input-email']");
	private By phonenumber=By.xpath("//input[@id='input-telephone']");
	private By password =By.xpath("//input[@id='input-password']");
	private By comformpassword = By.xpath("//input[@id='input-confirm']");
	private By subscriberedio  =By.xpath("(//input[@type='radio'])[3]");
	private By privecypolicy =By.xpath("//input[@type='checkbox']");
	private By submit =By.xpath("//input[@type='submit']");
	//assert
	private By verifyregestration=By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	//verify regestration blank data xpath
	private By Actchualfirstnameerror = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By Actchuallastnameerror = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By Actchualmailerror = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By Actchualphoneerror = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By Actchualpassworderror = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	
	public RagistrationPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement enterphonenumber() {
		return driver.findElement(phonenumber);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement entercomformpassword() {
		return driver.findElement(comformpassword);
	}
	public WebElement clickonrediobutton() {
		return driver.findElement(subscriberedio);
	}
	public WebElement clickonprivecypolicy() {
		return driver.findElement(privecypolicy);
	}
	public  WebElement clickonsubmit() {
		return driver.findElement(submit);
	}
	//aseertion method
	public WebElement registrationsucsessfull() {
		return driver.findElement(verifyregestration);
	}
	
	//verify regestration blank data method Assertion 
	
	public WebElement acthualfirstnameerror() {
		return driver.findElement(Actchualfirstnameerror);
	}
	public WebElement acthuallastnameerror() {
		return driver.findElement(Actchuallastnameerror);
	}
	public WebElement acthualemailnameerror() {
		return driver.findElement(Actchualmailerror);
	}
	public WebElement acthualphonenameerror() {
		return driver.findElement(Actchualphoneerror);
	}
	public WebElement acthualpassworderror() {
		return driver.findElement(Actchualpassworderror);
	}
	
	
	

}
