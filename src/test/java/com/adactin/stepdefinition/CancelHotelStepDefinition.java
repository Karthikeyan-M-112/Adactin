package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class CancelHotelStepDefinition extends BaseClass{
	public static WebDriver driver=Runner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	@When("^User click the booked itinerary and view the details$")
	public void user_click_the_booked_itinerary_and_view_the_details() throws Throwable {
	    
	  mouseHover(pom.getCh().getBookItenerary());
	Thread.sleep(3000);
	  clickOnElements(pom.getCh().getBookItenerary());
	}

	@When("^User select a Hotel to cancel$")
	public void user_select_a_Hotel_to_cancel() throws Throwable {
	    Thread.sleep(2000);
	   clickOnElements(pom.getCh().getSelectCancel());
	}

	@Then("^User verify and cancel a hotel$")
	public void user_verify_and_cancel_a_hotel() throws Throwable {
	    Thread.sleep(2000);
	   clickOnElements(pom.getCh().getCancelSelected());
	}


}
