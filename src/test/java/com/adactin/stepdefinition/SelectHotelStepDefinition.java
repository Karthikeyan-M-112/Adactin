package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectHotelStepDefinition extends BaseClass {
	public static WebDriver driver=Runner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	
	@When("^User select from searched hotel$")
	public void user_select_from_searched_hotel() throws Throwable {
      
       
	    clickOnElements(pom.getSho().getSelec());
	}

	@Then("^User verify the details$")
	public void user_verify_the_details() throws Throwable {

	    clickOnElements(pom.getSho().getContin());
	}

}
