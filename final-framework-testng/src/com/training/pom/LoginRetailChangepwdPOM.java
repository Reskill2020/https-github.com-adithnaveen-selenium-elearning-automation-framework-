package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRetailChangepwdPOM {
	private WebDriver driver; 
	
	public LoginRetailChangepwdPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@value='Login']") 
	private WebElement loginBtn; 
	
	@FindBy(linkText="Change your password") 
	private WebElement ChangePWD; 
	
	@FindBy(className="form-control")
	private WebElement npassword;
	
	
	@FindBy(id="input-confirm")
	private WebElement cconfirmpassword;
	
	@FindBy(xpath="//*[@value='Continue']") 
	private WebElement next; 
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickchangepwdBtn() {
		this.ChangePWD.click(); 
	}
	
	public void newPassword(String password) {
	this.npassword.clear(); 
		this.npassword.sendKeys(password); 
	}
	public void confirmPassword(String cpassword) {
		this.cconfirmpassword.clear(); 
		this.cconfirmpassword.sendKeys(cpassword); 
	}
	public void clicknext() {
		this.next.click(); 
	}


}
