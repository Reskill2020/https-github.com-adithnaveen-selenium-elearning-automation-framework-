package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeguestuserPOM {
	private WebDriver driver; 
	
	public HomeguestuserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Integer vitae iaculis massa")
	private WebElement user_icon; 
	
	
	
	public void ClickUserIcon() {
		this.user_icon.click(); 
		 
	}
	
	}
