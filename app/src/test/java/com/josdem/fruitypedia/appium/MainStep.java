package com.josdem.fruitypedia.appium;

import static com.josdem.fruitypedia.appium.pages.BasePage.driver;
import static com.josdem.fruitypedia.appium.utils.CommonCommands.waitForElement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.josdem.fruitypedia.appium.pages.CategoryPage;
import com.josdem.fruitypedia.appium.util.ConfigurationReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.logging.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MainStep {

    private WebElement textView;

    private Long timeToSleep = Long.parseLong(ConfigurationReader.getProperty("appium.sleep"));
    private Logger log = Logger.getLogger(this.getClass().getName());

    private CategoryPage categoryPage = new CategoryPage();

    public MainStep() throws IOException {
    }


    @Given("A categories view")
    public void shouldValidateCategoriesExist() throws InterruptedException {
        log.info("Running: I validate categories are visible " + LocalDate.now());
        categoryPage.validateCategories();
    }

    @Then("I should be able to click in the category")
    public void shouldClickInCategory() {
        log.info("Running: I should be able to click in the category at " + LocalDate.now());
        categoryPage.clickOnFirstCategory();
    }


}
