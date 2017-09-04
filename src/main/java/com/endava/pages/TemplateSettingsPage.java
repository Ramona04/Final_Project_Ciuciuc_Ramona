package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplateSettingsPage {

    @FindBy(xpath = ".//*[@id='page-site']/div/legend")
    private WebElement pageLegend;

    private WebDriver webDriver;

    public TemplateSettingsPage(WebDriver driver) {
        this.webDriver = driver;
    }
}
