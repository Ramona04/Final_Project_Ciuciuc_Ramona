package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopularTagsPage {
    private WebDriver webDriver;

    public PopularTagsPage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(id = "#filter-search")
    private WebElement searchBox;

}
