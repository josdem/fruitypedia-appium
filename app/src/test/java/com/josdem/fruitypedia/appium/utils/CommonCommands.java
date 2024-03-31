package com.josdem.fruitypedia.appium.utils;

import com.josdem.fruitypedia.appium.pages.BasePage;
import com.josdem.fruitypedia.appium.util.ConfigurationReader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class CommonCommands extends BasePage {
    public CommonCommands() throws IOException {}

    public static WebElement waitForElement(RemoteWebElement element){
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigurationReader.getProperty("appium.timeout"))));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

}
