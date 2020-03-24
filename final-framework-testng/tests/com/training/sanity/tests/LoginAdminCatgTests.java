package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.HomeAdminCatgPOM;
import com.training.pom.HomeAdminPOM;
import com.training.pom.HomePOM;
import com.training.pom.LoginAdminCatgPOM;
import com.training.pom.LoginAdminPOM;
import com.training.pom.LoginPOM;
import com.training.pom.Testcatagory;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginAdminCatgTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginAdminCatgPOM loginPOM;
	private HomeAdminCatgPOM homePOM;
	private Testcatagory catagoryPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginAdminCatgPOM(driver); 
		homePOM = new HomeAdminCatgPOM(driver);
		//catagoryPOM = new Testcatagory(driver);
		
		baseUrl = properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		homePOM.UserName("admin");
		homePOM.UserPWD("admin@123");
		homePOM.Clickloginbtn();
		Thread.sleep(3000);
		loginPOM.mouseover();
		loginPOM.prodclick();
		loginPOM.addnew();
		loginPOM.prod("Finger Ring");
		loginPOM.desc("GoldRing");
		loginPOM.metatag("Finger Ring for ladies");
		loginPOM.descmeta("Ring");
		loginPOM.savebutton();
		//catagoryPOM.main(arg);
		
		
		}
}
