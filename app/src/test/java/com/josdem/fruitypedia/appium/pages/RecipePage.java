package com.josdem.fruitypedia.appium.pages;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.remote.RemoteWebElement;

import java.io.IOException;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class RecipePage extends BasePage {

    @AndroidFindBy(id = "name")
    private RemoteWebElement nameTextView;

    @AndroidFindBy(id = "image")
    private RemoteWebElement imageView;

    @AndroidFindBy(id = "ingredients")
    private RemoteWebElement ingredientsTextView;

    @AndroidFindBy(id = "recipe")
    private RemoteWebElement recipeTextView;


    public RecipePage() throws IOException {
    }

    public void validateRecipe() {
        assertNotNull(nameTextView);
        assertNotNull(imageView);
        assertNotNull(ingredientsTextView);
        assertNotNull(recipeTextView);
    }
}
