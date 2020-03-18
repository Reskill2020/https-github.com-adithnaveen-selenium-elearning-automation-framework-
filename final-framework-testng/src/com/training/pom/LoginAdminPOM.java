package com.training.pom;

import java.util.Calendar;
import java.util.TimeZone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginAdminPOM {
	private WebDriver driver; 
	
	public LoginAdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-tags fw']")
	private WebElement produceicon; 
	
	@FindBy(linkText="Products")
	private WebElement prod; 
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addnew; 
	
	@FindBy(id="input-name1")
	private WebElement product; 
	
	@FindBy(id="input-meta-title1")
	private WebElement metatag; 
	
	@FindBy(linkText="Data")
	private WebElement datatab; 
	
	@FindBy(id="input-model")
	private WebElement model; 
	
	@FindBy(id="input-price")
	private WebElement price; 
	
	
	@FindBy(id="input-quantity")
	private WebElement quantity; 
	
	@FindBy(linkText="Links")
	private WebElement linktab; 
	
	@FindBy(xpath="//input[@id='input-category']")
	private WebElement catagory; 
	
	@FindBy(linkText="Discount")
	private WebElement discounttab; 
	
	@FindBy(xpath="//button[@data-original-title='Add Discount']")
	private WebElement adddescount; 
	
	@FindBy(xpath="//input[@name='product_discount[0][quantity]']")
	private WebElement discquantity; 
	
	@FindBy(xpath="//input[@name='product_discount[0][price]']")
	private WebElement discprice; 
	
	@FindBy(xpath="(//button[@class='btn btn-default'])[2]")
	private WebElement startdate; 
	
	//@FindBy(xpath="//td[@class='day active today']")
	//private WebElement startdatevalue; 
	
	
	@FindBy(xpath="(//button[@class='btn btn-default'])[3]")
	private WebElement enddate; 
	
	@FindBy(linkText="Reward Points")
	private WebElement rewardtab; 
	
	@FindBy(id="input-points")
	private WebElement rewardpoint; 
	
	@FindBy(xpath="//button[@data-original-title='Save']")
	private WebElement savebtn; 
	
	
	
		
	public void mouseover() {
		Actions actions = new Actions(driver);
		actions.moveToElement(produceicon).build().perform();
		 
	}
	public void prodclick() {
		this.prod.click();
	}
	
	public void addnew() {
		this.addnew.click();
	}
	
	public void prod(String prod1) {
		this.product.clear();
		this.product.sendKeys(prod1);
	}
	
	public void metatag(String mtag) {
		this.metatag.clear();
		this.metatag.sendKeys(mtag);
	}
	
	public void datatab() {
		this.datatab.click();
	}
	
	public void model1(String mod) {
		this.model.clear();
		this.model.sendKeys(mod);
	}
	
	public void price1(String pr) {
		this.price.clear();
		this.price.sendKeys(pr);
	}
	
	public void quant(String qty) {
		this.quantity.clear();
		this.quantity.sendKeys(qty);
	}
	
	public void LinkTab() {
		this.linktab.click();
	}
	
public void Catagory1(String cat) {
	
	this.catagory.clear();
	this.catagory.sendKeys(cat);
		
		
		}

public void DisTab() {
	this.discounttab.click();
}

public void AddDescount() {
	this.adddescount.click();
}

public void diskqty(String dqty) {
	this.discquantity.clear();
	this.discquantity.sendKeys(dqty);
}

public void diskprice(String price1) {
	this.discprice.clear();
	this.discprice.sendKeys(price1);
}

public void StartDate(String Tdate) {
	this.startdate.click();
	this.startdate.sendKeys(Tdate);
	
	}



public void EndDate(String Edate) {
	this.enddate.click();
	
	this.enddate.sendKeys(Edate);
}
public void Rtab() {
	this.rewardtab.click();
}


public void Rpoint(String point) {
	this.rewardpoint.clear();
	this.rewardpoint.sendKeys(point);
}

public void savebutton() {
	this.savebtn.click();
}

	
}

