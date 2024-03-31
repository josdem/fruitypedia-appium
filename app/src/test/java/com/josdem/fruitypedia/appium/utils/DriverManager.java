package com.josdem.fruitypedia.appium.utils;

import com.josdem.fruitypedia.appium.service.AppiumService;
import com.josdem.fruitypedia.appium.service.impl.AppiumServiceImpl;
import com.josdem.fruitypedia.appium.util.ConfigurationReader;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {

    private static AndroidDriver driver;
    private static final AppiumService appiumService = new AppiumServiceImpl();
    private static DesiredCapabilities capabilities = new DesiredCapabilities();
    public static AndroidDriver getDriver() throws IOException {
        if (driver == null) {
            appiumService.setCapabilities(capabilities);
            driver = new AndroidDriver(new URL(ConfigurationReader.getProperty("appium.server")), capabilities);
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
