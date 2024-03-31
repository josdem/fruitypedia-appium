package com.josdem.fruitypedia.appium;

import com.josdem.fruitypedia.appium.pages.BeveragePage;
import com.josdem.fruitypedia.appium.pages.CategoryPage;
import com.josdem.fruitypedia.appium.pages.RecipePage;
import com.josdem.fruitypedia.appium.util.ConfigurationReader;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Logger;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainStep {

    private WebElement textView;

    private Long timeToSleep = Long.parseLong(ConfigurationReader.getProperty("appium.sleep"));
    private Logger log = Logger.getLogger(this.getClass().getName());

    private CategoryPage categoryPage = new CategoryPage();
    private BeveragePage beveragePage = new BeveragePage();
    private RecipePage recipePage = new RecipePage();

    public MainStep() throws IOException {
    }

    @Given("A categories view")
    public void shouldValidateCategoriesExist() {
        log.info("Running: I validate categories are visible " + LocalDate.now());
        categoryPage.validateCategories();
    }

    @When("I click in the first category")
    public void shouldClickInCategory() {
        log.info("Running: I should be able to click in the category at " + LocalDate.now());
        categoryPage.clickOnFirstCategory();
    }

    @And("I validate list beverages")
    public void shouldValidateListBeverages() {
        log.info("Running: I should be able to validate list beverages at " + LocalDate.now());
        beveragePage.validateBeverages();
    }

    @And("I click on the first beverage")
    public void shouldClickOnFirstBeverage() {
        log.info("Running: I should be able to click on first beverage at " + LocalDate.now());
        beveragePage.clickOnFirstBeverage();
    }

    @And("I validate recipe view")
    public void shouldValidateRecipeView() {
        log.info("Running: I should validate recipe view at " + LocalDate.now());
        recipePage.validateRecipe();
    }


}
