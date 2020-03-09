package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeRetailPOM2 {
	private WebDriver driver; 
	
	public HomeRetailPOM2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="fa-user-o")
	private WebElement user_icon; 
	
	
	
	public void ClickUserIcon() {
		this.user_icon.click(); 
		 
	}
	
	}
