package com.josdem.fruitypedia.appium;

import static com.josdem.fruitypedia.appium.pages.BasePage.driver;

import com.josdem.fruitypedia.appium.pages.BeveragePage;
import com.josdem.fruitypedia.appium.pages.CategoryPage;
import com.josdem.fruitypedia.appium.pages.RecipePage;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Logger;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainStep {

    private CategoryPage categoryPage = new CategoryPage();
    private BeveragePage beveragePage = new BeveragePage();
    private RecipePage recipePage = new RecipePage();

    private Logger log = Logger.getLogger(this.getClass().getName());

    public MainStep() throws IOException {}

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

    @And("I should back to beverage section")
    public void shouldBackToBeverageSection() {
        log.info("Running: I should back to the beverage section at " + LocalDate.now());
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    @Then("I should back to category section")
    public void shouldBackToCategorySection() {
        log.info("Running: I should back to the category section at " + LocalDate.now());
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
