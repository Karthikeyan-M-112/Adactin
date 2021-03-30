package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@ExtendedCucumberOptions(retryCount=2)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
                 glue = "com\\adactin\\stepdefinition",
                 monochrome=true,
                 dryRun = false,
                 strict = true,
                 plugin= {"html:htmlreports",
                		 "com.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberReports.html",
                		 "rerun:Reports1/FailedScenario.txt"
})
                 
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
public static void setUp() throws IOException 
{
String browsername=FileReaderManager.getInstance().getCrInstance().getBrowser();
driver=BaseClass.getBrowser(browsername);
}
	@AfterClass
public static void tearDown() 
{
	driver.quit();

}
}
