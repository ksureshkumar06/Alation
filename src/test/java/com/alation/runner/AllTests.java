package com.alation.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.alation"}, features = "src/test/resources/features", format = {"pretty",
        "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"}, tags = {"@data_catalog"})
public class AllTests {

}