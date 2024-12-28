package Resourse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {// browser lunch code+++

	public static WebDriver driver;
	public static String emailadress=generaterendomemail();  //static
	public Properties prop;

	public void initializeDriver() throws IOException {
		// read data.property file
		FileInputStream fis = new FileInputStream("C:\\Users\\Aniket Kolekar\\eclipse-workspace\\Freamwork\\src\\main\\java\\Resourse\\data.properties");
		// access the property file
		 prop = new Properties();
		// get property data
		prop.load(fis);
		// fetch the value of key ... is a key this value store in data.properties file
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please choose the correct driveer");
		}
	}
	// dynamic mail come
	public static String generaterendomemail() {
		return System.currentTimeMillis()+"@gmail.com";
	}
	@BeforeMethod
	public void BrowserLunch() throws IOException {
		initializeDriver();
		//paste in data property file url=https://naveenautomationlabs.com/opencart/index.php
		//driver.get("https://naveenautomationlabs.com/opencart/index.php");
		//now
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	 @BeforeSuite
	 public void setupReport() {
	       ExtentReportManager.setup();
	 }
	
	 @AfterSuite
	 public void endReporttest() {
		 ExtentReportManager.endReport();
	 }
	
	
	// To take the screenshot and store in one folder-
		public static String screenShot(WebDriver driver, String filename){
			String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			// 20241221080205

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\Screenshots\\" + filename + "_" + date + ".png";
			 // VerifyRresgiertaionWithValiData_20241218083700.png
			try {
				FileUtils.copyFile(source, new File(destination));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return destination;

}
}
