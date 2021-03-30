package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
    public static WebDriver driver;
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditcardno;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement ccexpmonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement ccexpyear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvnum;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement booknow;

	public BookHotel(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
}

