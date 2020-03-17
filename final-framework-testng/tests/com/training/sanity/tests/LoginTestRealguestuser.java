package com.training.sanity.tests;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePOM;
import com.training.pom.HomeRetailEditProfilePOM;
import com.training.pom.HomeRetailPOM2;
import com.training.pom.HomeguestuserPOM;
import com.training.pom.LoginPOM;
import com.training.pom.LoginRetailEditProfilePOM;
import com.training.pom.LoginRetailPOM2;
import com.training.pom.LoginguestuserPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTestRealguestuser {

	private WebDriver driver;
	private String baseUrl;
	private LoginguestuserPOM loginPOM;
	private HomeguestuserPOM homePOM;
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
		loginPOM = new LoginguestuserPOM(driver); 
		homePOM = new HomeguestuserPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		//Actions ac= new Actions(driver);
		homePOM.ClickUserIcon();
		loginPOM.clickaddtocartBtn();
		//Thread.sleep(5000);
		
		loginPOM.mouseover();
		loginPOM.ViewcartBtn();
		loginPOM.checkotbtn();
		loginPOM.Radiobtn();
		loginPOM.Continuebtn();
		loginPOM.Fname("Shweta");
		loginPOM.Lname("Dubey");
		loginPOM.Email("dubey@gmail.com");
		loginPOM.Phone("23424243");
		loginPOM.Address("vishrantwadi");
		loginPOM.city("Pune");
		loginPOM.country("India");
		Thread.sleep(3000);
		loginPOM.region("Delhi");
		
		loginPOM.checkbox();
		loginPOM.continue1();
		loginPOM.com("thanks");
		loginPOM.continue1c();
		loginPOM.condition();
		Thread.sleep(3000);
		loginPOM.continueterm();;
		screenShot.captureScreenShot("guestuser");
	}
}
