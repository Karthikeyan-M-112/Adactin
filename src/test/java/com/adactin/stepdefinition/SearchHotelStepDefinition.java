package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SearchHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelStepDefinition extends BaseClass{
	   public static WebDriver driver=Runner.driver;
	  PageObjectManager pom=new PageObjectManager(driver);
	@When("^User select  \"([^\"]*)\" as location$")
	public void user_select_as_location(String arg1) throws Throwable {
	    
	selectDropDown(pom.getSh().getLocation(), "visibletext", arg1);
	   
	}

	@When("^User select  \"([^\"]*)\" as Hotels$")
	public void user_select_as_Hotels(String arg1) throws Throwable {
	    
	   selectDropDown(pom.getSh().getHotels(), "visibletext", arg1);
	}

	@When("^User select   \"([^\"]*)\" as Room Type$")
	public void user_select_as_Room_Type(String arg1) throws Throwable {
	    selectDropDown(pom.getSh().getRoomtype(), "visibletext", arg1);
	   
	}

	@When("^User select  \"([^\"]*)\" as Number of rooms$")
	public void user_select_as_Number_of_rooms(String arg1) throws Throwable {
	    selectDropDown(pom.getSh().getNos(), "visibletext", arg1);
	   
	}

	@When("^User enters \"([^\"]*)\" as Check In Date$")
	public void user_enters_as_Check_In_Date(String arg1) throws Throwable {
		
	   inputToElements(pom.getSh().getCheckin(), arg1);
	   
	}

	@When("^User enters  \"([^\"]*)\" as Check Out Date$")
	public void user_enters_as_Check_Out_Date(String arg1) throws Throwable {
	    inputToElements(pom.getSh().getCheckout(), arg1);
	   
	}

	@When("^User select  \"([^\"]*)\" as Adults per room$")
	public void user_select_as_Adults_per_room(String arg1) throws Throwable {

	    selectDropDown(pom.getSh().getAdultroom(), "visibletext", arg1);
	}

	@When("^User select \"([^\"]*)\" as Children per room$")
	public void user_select_as_Children_per_room(String arg1) throws Throwable {
      selectDropDown(pom.getSh().getChildroom(), "visibletext",arg1);
	    
	}
	
	@Then("^User verify the selected hotel details$")
	public void user_verify_the_selected_hotel_details() throws Throwable {

	    clickOnElements(pom.getSh().getSearch());
	}




}
