package TestCases;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.AddtoCartpageobject;
import Resourse.BaseClass;
import Resourse.common_method;
import Resourse.constants;

public class AddToCartTestcase extends BaseClass {    //random changes aniketgit
	
	@Test
	public void AddtoCartTestcase() throws InterruptedException {
		
		AddtoCartpageobject acpo  =  new AddtoCartpageobject(driver);
		acpo.Sendiphone().sendKeys(constants.iphone);;
        acpo.Clickonsearch().click();
        common_method.expliciteWait(driver, 10, driver.findElement(By.xpath("//p[@class='price']")));
        String iphoneprise =acpo.Iphoneprise().getText();
       
		String [] iphonearray =iphoneprise.split(" ");
		System.out.println(Arrays.toString(iphonearray));
		String iphonecost=iphonearray[0];
		System.out.println(iphonecost);
		//convert $123.20Ex  to  123.20
		String finaliphoneprise=iphonecost.replaceAll("[^\\d.]","");
		System.out.println(finaliphoneprise);
		//Wrapper
		double iphoneprisedouble=Double.parseDouble(finaliphoneprise);
		
		Thread.sleep(2000);
		WebElement addtocartclick = driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]"));
		addtocartclick.click();
		
		//samsung
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(2000);
		String samsungcost = driver.findElement(By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::p[@class='price']")).getText();
		System.out.println(samsungcost);
		driver.findElement(By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::i[@class='fa fa-shopping-cart']")).click();
		
		String [] samsungarray =samsungcost.split(" ");
		System.out.println(Arrays.toString(samsungarray));
		String samsungprise =samsungarray[0];
		System.out.println(samsungprise);
		String samsungfinalprise =samsungprise.replaceAll("[^\\d.]","");
		System.out.println(samsungfinalprise);
		//wrapper
		double samsungprisedouble=Double.parseDouble(samsungfinalprise);
		
		double totalphonecost =iphoneprisedouble+samsungprisedouble;
		System.out.println(totalphonecost+"totalcost");
		String totalphonecosts="$"+totalphonecost;
		
		//click on main add tocart
		driver.findElement(By.xpath("//div[@class='btn-group btn-block']")).click();		
		//total from cart 
		String addttocarttotal = driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[4]/td[2]")).getText();
	
		if(addttocarttotal.equals(totalphonecosts)) {
			System.out.println("the value is matching for add to cart ");
		}
		else {
			System.out.println("test case fail value is not matching");
		}
		
		
		
		
		
	}

}
