package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginguestuserPOM {
	private static final String Continue = null;


	private WebDriver driver; 
	
	public LoginguestuserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		//Actions actions = new Actions(driver);
		//WebElement cart = driver.findElement(By.className("tb_icon ico-linea-ecommerce-bag"));
		
	}
	
	 	
	@FindBy(id="button-cart")
	private WebElement addtocartbtn; 
	
	
	//WebElement cart = driver.findElement(By.className("tb_icon ico-linea-ecommerce-bag"));
	
	@FindBy(xpath= "//i[@class='tb_icon ico-linea-ecommerce-bag']")
	private WebElement cart;
	
	@FindBy(linkText="View Cart")
	private WebElement ViewCartbtn; 
	
	@FindBy(linkText="Checkout")
	private WebElement CheckOutbtn; 
	
	@FindBy(xpath="//input[@value='guest']")
	private WebElement radiobutton;
	
	@FindBy(xpath="//input[@id='button-account']")
	private WebElement Continuebutton; 
		
	@FindBy(id="input-payment-firstname")
	private WebElement fname; 
	
	@FindBy(id="input-payment-lastname")
	private WebElement lname; 
	
	@FindBy(id="input-payment-email")
	private WebElement email; 
	
	@FindBy(id="input-payment-telephone")
	private WebElement phone; 
	
	@FindBy(id="input-payment-address-1")
	private WebElement address1; 
	
	@FindBy(id="input-payment-city")
	private WebElement city; 
	
	@FindBy(id="input-payment-country")
	private WebElement Country; 
	
	@FindBy(id="input-payment-zone")
	private WebElement region; 
	
	@FindBy(xpath="//input[@name='shipping_address']")
	private WebElement chkbox;
	
	@FindBy(xpath="//input[@id='button-guest']")
	private WebElement contibtn;
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement comment;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement commentcontibtn;
	
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement term;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement termcontibtn;
	
	
	public void clickaddtocartBtn() {
		this.addtocartbtn.click(); 
	}
	
	public void mouseover() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='tb_icon ico-linea-ecommerce-bag']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(cart).build().perform();
	
	}
	public void ViewcartBtn() {
		this.ViewCartbtn.click(); 
	}
	public void checkotbtn() {
		this.CheckOutbtn.click();
	}
		
	public void Radiobtn() {
		this.radiobutton.click();
	}
	public void Continuebtn() {
		this.Continuebutton.click();
	}
	public void Fname(String firstname) {
		this.fname.clear(); 
		this.fname.sendKeys(firstname); 
	}
	
	public void Lname(String lastname) {
		this.lname.clear(); 
		this.lname.sendKeys(lastname); 
	}
	
	public void Email(String email1) {
		this.email.clear(); 
		this.email.sendKeys(email1); 
	}
	
	public void Phone(String phone1) {
		this.phone.clear(); 
		this.phone.sendKeys(phone1); 
	}
	
	public void Address(String add) {
		this.address1.clear(); 
		this.address1.sendKeys(add); 
	}
	
	public void city(String city1) {
		this.city.clear(); 
		this.city.sendKeys(city1); 
	}
	
	public void country(String con) {
		
		
		Select CON = new Select(Country);
		CON.selectByVisibleText(con);
		//CON.selectByIndex(2);
		}
	
	public void region(String reg) {
		Select REG = new Select(region);
		REG.selectByVisibleText(reg);
		//REG.selectByIndex(2);
}
	public void checkbox() {
		Boolean checked = this.chkbox.isSelected();
		if (checked == false) 
		{
		this.chkbox.click();
	}
		else{
			System.out.println("Selenium checkbox was selected on default");
			}
		}
	
	
	public void continue1() {
		this.contibtn.click();
	}
	
	public void com(String comm) {
		this.comment.clear(); 
		this.comment.sendKeys(comm); 
	}
	
	public void continue1c() {
		this.commentcontibtn.click();
	}	
	
	public void condition() {
		
		Boolean termchk = this.term.isSelected();
		if (termchk == false) 
		{
		this.term.click();
	}
		else{
			System.out.println("Selenium term was selected on default");
			}
	
		
	}
	
	public void continueterm() {
		this.termcontibtn.click();
	}
	
	
}
