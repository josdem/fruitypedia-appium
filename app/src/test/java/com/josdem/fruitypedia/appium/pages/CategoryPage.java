package com.josdem.fruitypedia.appium.pages;

import static com.josdem.fruitypedia.appium.utils.CommonCommands.waitForElement;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.remote.RemoteWebElement;

import java.io.IOException;
import java.util.stream.IntStream;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CategoryPage extends BasePage {

    @AndroidFindBy(id = "listViewCategories")
    private RemoteWebElement listView;

    @AndroidFindBy(id = "categoryTextView")
    private RemoteWebElement textView;

    @AndroidFindBy(id = "toolbar")
    private RemoteWebElement toolBar;

    @AndroidFindBy(id = "android:id/message")
    private RemoteWebElement message;

    public CategoryPage() throws IOException {}

    public void validateCategories() {
        waitForElement(listView);
    }

    public void clickOnFirstCategory() {
        assertEquals("Healing", textView.getText());
        textView.click();
    }

    public void clickOnToolbar(Integer times) {
        IntStream.rangeClosed(1, times).forEach(
                it -> waitForElement(toolBar).click()
        );
    }

    public void validateMessage() {
        waitForElement(message);
    }
}
