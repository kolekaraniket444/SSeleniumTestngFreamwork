package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCartpageobject {
	
	public WebDriver driver;
	
	private By iphone =By.xpath("//input[@placeholder='Search']");
	private By clicksearch=By.xpath("//button[@class='btn btn-default btn-lg']");
	private By iphoneprise=By.xpath("//p[@class='price']");
	private By addtocartiphone=By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	
	private By removeserch=By.xpath("//input[@placeholder='Search']");
	
	private By samsung=By.xpath("//input[@placeholder='Search']");
	private By samsungprise=By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::p[@class='price']");
	private By samsungaddtocart=By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::i[@class='fa fa-shopping-cart']");
	
	private By clickoncartdetails=By.xpath("//div[@class='btn-group btn-block']");
	private By addtocarttotal=By.xpath("//table[@class='table table-bordered']//tr[4]/td[2]");
	
	public AddtoCartpageobject(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement Sendiphone() {
		return driver.findElement(iphone);
	}
	public WebElement Clickonsearch() {
		return driver.findElement(clicksearch);
	}
	public WebElement Iphoneprise() {
		return driver.findElement(iphoneprise);
	}
	public WebElement Addtocartiphone() {
		return driver.findElement(addtocartiphone);
	}
	public WebElement Clearesearch() {
		return driver.findElement(removeserch);
	}
	public WebElement sendsamsun() {
		return driver.findElement(samsung);
	}
	public WebElement samsunprise() {
		return driver.findElement(samsungprise);
	}
	public WebElement Addtocartsamsung() {
		return driver.findElement(samsungprise);
	}
	public WebElement ClickonAddtocart() {
		return driver.findElement(clickoncartdetails);
	}
	public WebElement Addtocartcost() {
		return driver.findElement(addtocarttotal);
	}
	
}
