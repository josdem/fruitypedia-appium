package com.josdem.fruitypedia.appium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.josdem.fruitypedia.appium.util.ConfigurationReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

import java.time.Duration;
import java.time.LocalDate;
import java.util.logging.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MainTest extends BaseTest {

    private WebElement textView;
    private AndroidDriver driver;

    private Long timeToSleep = Long.parseLong(ConfigurationReader.getProperty("appium.sleep"));
    private Logger log = Logger.getLogger(this.getClass().getName());

    @When("I launch the application")
    public void shouldLaunchTheApplication() throws Exception {
        log.info("Running: I launch the application at " + LocalDate.now());
        driver = getDriver();
    }

    @And("I validate categories are visible")
    public void shouldValidateCategoriesExist() {
        log.info("Running: I validate categories are visible " + LocalDate.now());
        WebElement listView = driver.findElement(By.id("listViewCategories"));
        assertNotNull(listView);
        textView = driver.findElement(By.id("categoryTextView"));
        assertEquals("Healing", textView.getText());
    }

    @And("I should be able to click in the category")
    public void shouldClickInCategory() {
        log.info("Running: I should be able to click in the category at " + LocalDate.now());
        waitForElement(textView).click();
    }
    @And("I should be able to list beverages")
    public void shouldListBeverages() {
        log.info("Running: I should be able to list beverages at " + LocalDate.now());
        textView = driver.findElement(By.id("beverageTextView"));

        log.info("Beverages container and beverage list are there");
        assertEquals("Anti-constipation Smoothie", textView.getText());
    }
    @And("I should be able to click in a beverage")
    public void shouldClickInBeverage() {
        log.info("Running: I should be able to click in a beverage at " + LocalDate.now());
        waitForElement(textView).click();
    }

    @And("I should be able to view a recipe")
    public void shouldViewRecipe() {
        log.info("Running: I should be able to view a recipe at " + LocalDate.now());
        assertNotNull(driver.findElement(By.id("name")));
        assertNotNull(driver.findElement(By.id("image")));
        assertNotNull(driver.findElement(By.id("ingredients")));
        assertNotNull(driver.findElement(By.id("recipe")));
    }
    @And("I should back to beverage section")
    public void shouldBackToBeverageSection() throws Exception {
        log.info("Running: I should back to the beverage section at " + LocalDate.now());
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Sleeper.SYSTEM_SLEEPER.sleep(Duration.ofSeconds(timeToSleep));
    }

}
