package com.josdem.fruitypedia.appium;

import com.josdem.fruitypedia.appium.service.AppiumService;
import com.josdem.fruitypedia.appium.service.impl.AppiumServiceImpl;
import com.josdem.fruitypedia.appium.util.ConfigurationReader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

    private static AndroidDriver driver;
    private static AppiumService appiumService = new AppiumServiceImpl();
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    public static AndroidDriver getDriver() throws IOException {
        if (driver == null) {
            appiumService.setCapabilities(capabilities);
            driver = new AndroidDriver(new URL(ConfigurationReader.getProperty("appium.server")), capabilities);
        }
        return driver;
    }

    public static WebElement waitForElement(WebElement element){
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigurationReader.getProperty("appium.timeout"))));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
