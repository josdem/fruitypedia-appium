package com.josdem.fruitypedia.appium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.util.logging.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainTest extends BaseTest {

    private AndroidDriver driver;

    private Logger log = Logger.getLogger(this.getClass().getName());

    @When("I launch the application")
    public void shouldLaunchTheApplication() throws Exception {
        log.info("Running: I launch the application at " + LocalDate.now());
        driver = getDriver();
    }

    @Then("I validate categories are visible")
    public void shouldValidateCategoriesExist() {
        log.info("Running: I validate categories are visible " + LocalDate.now());
        WebElement listView = driver.findElement(By.id("listViewCategories"));
        assertNotNull(listView);
    }
}
