package com.josdem.fruitypedia.appium.pages;

import static com.josdem.fruitypedia.appium.utils.CommonCommands.waitForElement;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.remote.RemoteWebElement;

import java.io.IOException;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class CategoryPage extends BasePage {

    @AndroidFindBy(id = "listViewCategories")
    private RemoteWebElement listView;

    @AndroidFindBy(id = "categoryTextView")
    private RemoteWebElement textView;


    public CategoryPage() throws IOException {
        super();
    }

    public void validateCategories() {
        waitForElement(listView);
    }

    public void clickOnFirstCategory() {
        assertEquals("Healing", textView.getText());
        textView.click();
    }
}
