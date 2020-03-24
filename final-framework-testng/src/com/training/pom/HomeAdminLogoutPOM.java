package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAdminLogoutPOM {
	private WebDriver driver; 
	
	public HomeAdminLogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement username; 
	
	@FindBy(id="input-password")
	private WebElement userpwd; 
	
		
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Loginbtn;
	
	
	public void UserName(String name) {
		this.username.clear(); 
		this.username.sendKeys(name); 
	 	 
	}
	public void UserPWD(String pwd) {
		this.userpwd.clear(); 
		this.userpwd.sendKeys(pwd);  
		 
	}
	
	public void Clickloginbtn() {
		this.Loginbtn.click();
	}
	
	
	}
