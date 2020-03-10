package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePOM;
import com.training.pom.HomeRetailEditProfilePOM;
import com.training.pom.LoginPOM;
import com.training.pom.LoginRetailEditProfilePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginRealEditProfileTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginRetailEditProfilePOM loginPOM;
	private HomeRetailEditProfilePOM homePOM;
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
		loginPOM = new LoginRetailEditProfilePOM(driver); 
		homePOM = new HomeRetailEditProfilePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() 
	{
		homePOM.ClickUserIcon();
		loginPOM.sendUserName("dubeyshweta.mca@gmail.com");
		loginPOM.sendPassword("March@202000000");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickEditprofileBtn();
		//Thread.sleep(1000);
		
		loginPOM.sendFirstname("manzoor");
		loginPOM.sendLastname("mehadi");
		loginPOM.sendEmail("manzoor@gmail.com");
		loginPOM.sendPhone("9876543210");
		loginPOM.clicknext();
		
		
		
		screenShot.captureScreenShot("EditProfile");
	}
}
