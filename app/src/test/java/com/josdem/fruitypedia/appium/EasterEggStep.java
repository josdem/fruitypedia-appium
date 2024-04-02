package com.josdem.fruitypedia.appium;

import com.josdem.fruitypedia.appium.pages.CategoryPage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EasterEggStep {

    private CategoryPage categoryPage = new CategoryPage();
    private Logger log = Logger.getLogger(this.getClass().getName());

    public EasterEggStep() throws IOException {}

    @When("^I click on toolbar \"([^\"]*)\" times$")
    public void shouldClickOnToolbarSeveralTimes(Integer times) {
        log.info("Running: I click on toolbar at " + LocalDate.now());
        categoryPage.clickOnToolbar(times);
    }

    @Then("I validate I can see a hello message")
    public void shouldValidateMessage() {
        log.info("Running: I validate I can see a hello message at " + LocalDate.now());
        categoryPage.validateMessage();
    }
}
