package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelHotel {

	public static WebDriver driver;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookItenerary;
	
	@FindBy(xpath="(//input[@name='ids[]'])[2]")
	private WebElement selectCancel;
	
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement cancelSelected;
	
	

	public CancelHotel(WebDriver cdriver) {
		this.driver=cdriver;
		PageFactory.initElements(driver, this);
		
		}

	public WebElement getBookItenerary() {
		return bookItenerary;
	}

	public WebElement getSelectCancel() {
		return selectCancel;
	}

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	


}   


