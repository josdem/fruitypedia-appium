package com.josdem.fruitypedia.appium.service.impl;

import com.josdem.fruitypedia.appium.service.AppiumService;
import com.josdem.fruitypedia.appium.util.ConfigurationReader;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumServiceImpl implements AppiumService {

    @Override
    public void setCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("deviceName", ConfigurationReader.getProperty("device.name"));
        capabilities.setCapability("platformName", ConfigurationReader.getProperty("device.platform"));
        capabilities.setCapability("platformVersion", ConfigurationReader.getProperty("device.version"));
        capabilities.setCapability("appPackage", ConfigurationReader.getProperty("application.package"));
        capabilities.setCapability("appActivity", ConfigurationReader.getProperty("application.activity"));
        capabilities.setCapability("automationName", ConfigurationReader.getProperty("appium.automator"));
        capabilities.setCapability("app", ConfigurationReader.getProperty("application.path"));
    }
}
