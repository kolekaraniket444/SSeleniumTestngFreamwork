package Resourse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class common_method {
	
	
	//common method Assert handling 
	
	public static void handleassertion(String Actualresult,String Expectedresult) {
		
		SoftAssert sa =new SoftAssert();
		
		String Actual =Actualresult;
		String Expected=Expectedresult;
		
		sa.assertEquals(Actual, Expected);
		
		sa.assertAll();
		
	}
	
	public static void expliciteWait(WebDriver driver,int time , WebElement element) {
		
		WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
}


