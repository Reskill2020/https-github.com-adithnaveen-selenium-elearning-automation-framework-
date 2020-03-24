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
import com.training.pom.HomeAdminLogoutPOM;
import com.training.pom.HomeAdminPOM;
import com.training.pom.HomePOM;
import com.training.pom.LoginAdminLogoutPOM;
import com.training.pom.LoginAdminPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginAdminLogoutTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginAdminLogoutPOM loginPOM;
	private HomeAdminLogoutPOM homePOM;
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
		loginPOM = new LoginAdminLogoutPOM(driver); 
		homePOM = new HomeAdminLogoutPOM(driver);
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
		loginPOM.metatag("Finger Ring for ladies");
		loginPOM.datatab();
		loginPOM.model1("SKU-012");
		loginPOM.price1("500");
		loginPOM.quant("50");
		loginPOM.LinkTab();
		loginPOM.Catagory1("Electronic");
		loginPOM.DisTab();
		loginPOM.AddDescount();
		loginPOM.diskqty("1");
		loginPOM.diskprice("50");
		Thread.sleep(3000);
		loginPOM.StartDate("03/18/2020");
		loginPOM.EndDate("04/18/2020");
		loginPOM.Rtab();
		loginPOM.Rpoint("3000");
		loginPOM.savebutton();
		loginPOM.homebutton();
		loginPOM.retail1();
		loginPOM.shopicon();
		
		
		Reporter.log("Expectation not match , unable to find created product and category under Shop tab");
		screenShot.captureScreenShot("Admin Catagory");
	
		
		
		screenShot.captureScreenShot("AdminLogout");
	}
}
