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
import com.training.pom.HomeRetailChangepwdPOM;
import com.training.pom.HomeRetailEditProfilePOM;
import com.training.pom.LoginPOM;
import com.training.pom.LoginRetailChangepwdPOM;
import com.training.pom.LoginRetailEditProfilePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginRealchangepwdTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginRetailChangepwdPOM loginPOM;
	private HomeRetailChangepwdPOM homePOM;
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
		loginPOM = new LoginRetailChangepwdPOM(driver); 
		homePOM = new HomeRetailChangepwdPOM(driver);
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
	public void validLoginTest() throws InterruptedException 
	{
		homePOM.ClickUserIcon();
		loginPOM.sendUserName("dubeyshweta.mca@gmail.com");
		loginPOM.sendPassword("assignment");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickchangepwdBtn();;
		
		
		loginPOM.newPassword("assignment1");
		Thread.sleep(1000);
		loginPOM.confirmPassword("assignment1");
		loginPOM.clicknext();
		
		
		
		screenShot.captureScreenShot("ChangePWD");
	}
}
