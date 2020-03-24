package com.training.pom;

import java.util.Calendar;
import java.util.TimeZone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginAdminCatgPOM {
	private WebDriver driver; 
	
	public LoginAdminCatgPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-tags fw']")
	private WebElement produceicon; 
	
	@FindBy(linkText="Categories")
	private WebElement Category; 
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnew; 
	
	@FindBy(id="input-name1")
	private WebElement product; 
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	private WebElement description; 
	
	
	@FindBy(id="input-meta-title1")
	private WebElement metatag; 
	
	@FindBy(xpath="//textarea[@id='input-meta-description1']")
	private WebElement descmetatag; 
	
	
	@FindBy(xpath="//button[@data-original-title='Save']")
	private WebElement savebtn; 
	
	
		
	public void mouseover() {
		Actions actions = new Actions(driver);
		actions.moveToElement(produceicon).build().perform();
		 
	}
	public void prodclick() {
		this.Category.click();
	}
	
	public void addnew() {
		this.addnew.click();
	}
	
	public void prod(String prod1) {
		this.product.clear();
		this.product.sendKeys(prod1);
	}
	
	public void desc(String desc1) {
		this.description.clear();
		this.description.sendKeys(desc1);
	}
	
	public void metatag(String mtag) {
		this.metatag.clear();
		this.metatag.sendKeys(mtag);
	}
	
	
	public void descmeta(String meta) {
		this.descmetatag.clear();
		this.descmetatag.sendKeys(meta);
	}
	
	public void savebutton() {
	this.savebtn.click();
}

	
	
	
}

