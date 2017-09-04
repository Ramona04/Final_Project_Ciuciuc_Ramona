package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopularTagsPage {

    @FindBy(id = "#filter-search")
    private WebElement searchBox;

    @FindBy(xpath = ".//*[@id='adminForm']/ul/li/h3/a")
    private WebElement tagName;

    private WebDriver webDriver;

    public PopularTagsPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public String GetTagName(){
        return tagName.getText();
    }

}
