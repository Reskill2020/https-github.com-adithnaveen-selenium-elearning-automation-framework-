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
import com.training.pom.HomeRetailPOM2;
import com.training.pom.HomeRetailReturnProductPOM;
import com.training.pom.LoginPOM;
import com.training.pom.LoginRetailEditProfilePOM;
import com.training.pom.LoginRetailPOM2;
import com.training.pom.LoginRetailReturnProductPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTestsRealReturnProd {

	private WebDriver driver;
	private String baseUrl;
	private LoginRetailReturnProductPOM loginPOM;
	private HomeRetailReturnProductPOM homePOM;
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
		loginPOM = new LoginRetailReturnProductPOM(driver); 
		homePOM = new HomeRetailReturnProductPOM(driver);
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
		homePOM.ClickUserIcon();
		homePOM.sendUserName("dubeyshweta.mca@gmail.com"); 
		homePOM.sendPassword("assignment1");
		homePOM.clickLoginBtn();
		loginPOM.mouseover();
		Thread.sleep(2000);
		loginPOM.Clickmyorder();
		loginPOM.ClickView();
		loginPOM.ClickReturn();
		loginPOM.ClickReason();
		loginPOM.ClickOpenprod();
		loginPOM.InputComment("product is faulty");
		loginPOM.ClickSubbtn();
		screenShot.captureScreenShot("ReturnProd");
	}
}
