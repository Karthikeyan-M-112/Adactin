package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(features = "@Reports1/FailedScenario.txt",
                 glue = "com\\adactin\\stepdefinition",
                 monochrome=true,
                 dryRun = false,
                 strict = true,
                 plugin= {"html:htmlreports",
                		 "com.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberReports.html",
                		 "rerun:Reports1/FailedScenario.txt"
})
public class TestRunner {

}
