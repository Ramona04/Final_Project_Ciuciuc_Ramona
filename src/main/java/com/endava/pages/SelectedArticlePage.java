package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedArticlePage {
    @FindBy(xpath = ".//*[@id='content']/div[3]/div[1]/h2")
    private WebElement articleTitle;

    private WebDriver webDriver;

    public SelectedArticlePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public String GetArticleTitle(){
        return articleTitle.getText();
    }
}
