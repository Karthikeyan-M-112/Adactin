package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends BaseClass{
	public static WebDriver driver=Runner.driver;
	PageObjectManager pom=new PageObjectManager(driver);
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		String url=FileReaderManager.getInstance().getCrInstance().getUrl();
	    getUrl(url);
	   
	}

	@When("^User enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
		Thread.sleep(2000);
		inputToElements(pom.getLp().getUsername(), arg1);
	    
	}

	@When("^Users enters \"([^\"]*)\" as password$")
	public void users_enters_as_password(String arg1) throws Throwable {
		Thread.sleep(2000);
		inputToElements(pom.getLp().getPassword(), arg1);
	}

	@Then("^User verify the valid username and valid password$")
	public void user_verify_the_valid_username_and_valid_password() throws Throwable {
	    Thread.sleep(2000);
	    clickOnElements(pom.getLp().getLogin());
	   Assert.assertEquals("sdf", "hjk");
	}



}
