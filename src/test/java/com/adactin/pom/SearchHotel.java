package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement nos;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkout;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;
	
	public SearchHotel(WebDriver sdriver) {
		this.driver=sdriver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}
}
