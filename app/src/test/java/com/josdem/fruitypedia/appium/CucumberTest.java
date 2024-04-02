package com.josdem.fruitypedia.appium;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/reports/cucumberTests.json", "html:target/reports/report.html"}, features = "src/test/resources", glue = {"com.josdem.fruitypedia.appium"})
public class CucumberTest {}
