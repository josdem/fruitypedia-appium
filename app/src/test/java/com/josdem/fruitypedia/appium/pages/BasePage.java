package com.josdem.fruitypedia.appium.pages;

import com.josdem.fruitypedia.appium.utils.DriverManager;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

    public static AppiumDriver driver;

    public BasePage() throws IOException {
        driver = DriverManager.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
