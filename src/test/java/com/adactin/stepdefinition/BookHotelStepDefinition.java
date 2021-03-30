package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookHotel;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookHotelStepDefinition extends BaseClass{
   public static WebDriver driver=Runner.driver;
    PageObjectManager pom =new PageObjectManager(driver);
    		
	@When("^User enters \"([^\"]*)\" as firstname$")
	public void user_enters_as_firstname(String arg1) throws Throwable {

	    inputToElements(pom.getBh().getFirstname(), arg1);
	}
    
	@When("^User enters \"([^\"]*)\" as lastname$")
	public void user_enters_as_lastname(String arg1) throws Throwable {
        Thread.sleep(2000);
	    inputToElements(pom.getBh().getLastname(),arg1);
	}

	@When("^User enters \"([^\"]*)\" as Billing Address$")
	public void user_enters_as_Billing_Address(String arg1) throws Throwable {
        Thread.sleep(2000);
	    inputToElements(pom.getBh().getAddress(), arg1);
	}

	@When("^User enters \"([^\"]*)\" as credit card no$")
	public void user_enters_as_credit_card_no(String arg1) throws Throwable {
        Thread.sleep(2000);
	    inputToElements(pom.getBh().getCreditcardno(), "45870987123498");
	}

	@When("^User enters \"([^\"]*)\" as credit card type$")
	public void user_enters_as_credit_card_type(String arg1) throws Throwable {
        Thread.sleep(2000);
	    selectDropDown(pom.getBh().getCctype(), "visibletext", arg1);
	}

	@When("^User select \"([^\"]*)\" as Month of Expiry Date$")
	public void user_select_as_Month_of_Expiry_Date(String arg1) throws Throwable {
        Thread.sleep(2000);
	    selectDropDown(pom.getBh().getCcexpmonth(),"visibletext",arg1);
	}

	@When("^User select  \"([^\"]*)\" as Year of Expiry Date$")
	public void user_select_as_Year_of_Expiry_Date(String arg1) throws Throwable {
         Thread.sleep(2000);
	    selectDropDown(pom.getBh().getCcexpyear(), "visibletext", arg1);
	}

	@When("^User enters  \"([^\"]*)\" as CVV number$")
	public void user_enters_as_CVV_number(String arg1) throws Throwable {
        Thread.sleep(2000);
	    inputToElements(pom.getBh().getCvvnum(),arg1);
	}

	@Then("^User verify details and book hotel$")
	public void user_verify_details_and_book_hotel() throws Throwable {
        Thread.sleep(2000);
	    clickOnElements(pom.getBh().getBooknow());
	}


}
