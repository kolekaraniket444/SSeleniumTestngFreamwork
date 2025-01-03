package stepdefinationfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefination {
	public WebDriver driver;

	@Given("initialize browser")
	public void initialize_browser() {
		driver = new ChromeDriver();

	}

	@When("user opens the url {string}")
	public void user_opens_the_url(String url) {
		driver.get(url);
	}

	@And("^enter (.+) and (.+) and click on login button$")
    public void user_enter_and_and_clicks_on_login_button(String username, String password) throws Throwable {

    	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	driver.findElement(By.xpath("//input[@id='Login']")).click();
    
    	
    }

	@Then("user should be able to login suceesfuly")
	public void user_should_be_able_to_login_suceesfuly() {

		System.out.println("user able to logine sucsessfully");

	}

}
