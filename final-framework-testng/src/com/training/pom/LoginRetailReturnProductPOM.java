package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginRetailReturnProductPOM {
	private WebDriver driver; 
	
	public LoginRetailReturnProductPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="fa-user-o")
	private WebElement user_icon; 
	
	@FindBy(xpath="//li[@class='tb_link tb_menu_system_account_order']") 
	private WebElement myorder; 
	
	@FindBy(xpath="//i[@class='fa fa-eye']") 
	private WebElement View; 
	
	@FindBy(xpath="//i[@class='fa fa-reply']") 
	private WebElement Return;
	
	@FindBy(xpath="//input[@name='return_reason_id']") 
	private WebElement Reason; 
	
	@FindBy(xpath="//label[@class='radio-inline']") 
	private WebElement openprod; 
	
	@FindBy(xpath="//textarea[@id='input-comment']") 
	private WebElement Comment; 
	
	@FindBy(xpath="//input[@value='Submit']") 
	private WebElement Submitbtn; 
	
	
	
	
public void mouseover() {
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='tb_icon ico-linea-ecommerce-bag']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(user_icon).build().perform();
}
	
	
	public void Clickmyorder() {
		Actions actions = new Actions(driver);
		actions.moveToElement(myorder).build().perform();

		this.myorder.click(); 
	}
	
	public void ClickView() {
		this.View.click(); 
	}
	
	public void ClickReturn() {
		this.Return.click(); 
	}
	
	public void ClickReason() {
		this.Reason.click(); 
	}
	
	public void ClickOpenprod() {
		this.openprod.click(); 
	}
	
	
	public void InputComment(String comment1) {
		this.Comment.clear(); 
		this.Comment.sendKeys(comment1); 
	}
	
	public void ClickSubbtn() {
		this.Submitbtn.click(); 
	}
	
	
}
