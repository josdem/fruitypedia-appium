package com.josdem.fruitypedia.appium.util;

import com.josdem.fruitypedia.appium.service.AppiumService;
import com.josdem.fruitypedia.appium.service.impl.AppiumServiceImpl;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {

    private static AppiumDriver driver;

    private static AppiumService appiumService = new AppiumServiceImpl();
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    public static AppiumDriver getDriver() throws IOException {
        if (driver == null) {
            appiumService.setCapabilities(capabilities);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
