package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginRetailEditProfilePOM {
	private WebDriver driver; 
	
	public LoginRetailEditProfilePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//*[@value='Login']") 
	private WebElement loginBtn; 
	
	@FindBy(linkText="Edit your account information") 
	private WebElement Editprofile; 
	
	@FindBy(id="input-firstname")
	private WebElement firstname;
	
	@FindBy(id="input-lastname")
	private WebElement lastname;
	
	@FindBy(id="input-email")
	private WebElement Email;
	
	@FindBy(id="input-telephone")
	private WebElement phone;
	
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
	
	public void clickEditprofileBtn() {
		this.Editprofile.click(); 
	}
	
	public void sendFirstname(String fname) {
		this.firstname.clear();
		this.firstname.sendKeys(fname);
		
	}
	
	public void sendLastname(String lname) {
		this.lastname.clear(); 
		this.lastname.sendKeys(lname);
	}
	
	public void sendEmail(String mail) {
		this.Email.clear(); 
		this.Email.sendKeys(mail);
	}
	
	public void sendPhone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}

	public void clicknext() {
		this.next.click(); 
	}

}
