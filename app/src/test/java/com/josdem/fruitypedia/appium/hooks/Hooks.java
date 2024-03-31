package com.josdem.fruitypedia.appium.hooks;

import com.josdem.fruitypedia.appium.util.ConfigurationReader;
import com.josdem.fruitypedia.appium.utils.DriverManager;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private AppiumDriver driver;

    private Logger log = Logger.getLogger(this.getClass().getName());

    @Before
    public void startDriver() throws IOException {
        log.info("Starting driver");
        driver = DriverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigurationReader.getProperty("appium.wait")), TimeUnit.SECONDS);
    }

    @After
    public void stopDriver() {
        log.info("Stopping driver");
        if (driver != null) {
            DriverManager.quitDriver();
        }
    }
}
