package com.josdem.fruitypedia.appium.pages;

import static com.josdem.fruitypedia.appium.utils.CommonCommands.waitForElement;

import org.openqa.selenium.remote.RemoteWebElement;

import java.io.IOException;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class BeveragePage extends BasePage {

    @AndroidFindBy(id = "listViewBeverages")
    private RemoteWebElement listView;


    public BeveragePage() throws IOException {
        super();
    }

    public void validateBeverages() {
        waitForElement(listView);
    }
}