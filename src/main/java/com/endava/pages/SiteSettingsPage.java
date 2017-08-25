package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SiteSettingsPage {

    WebDriver webDriver;

    public SiteSettingsPage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(id = "jform_sitename")
    private WebElement siteName;

    @FindBy(css = ".controls #jform_offline0")
    private WebElement offlineYes;

    @FindBy(css = ".controls #jform_offline1")
    private WebElement offlineNo;

    @FindBy(css = "#jform_access_chzn .chzn-single")
    private WebElement defaultAccessDrop;

    @FindBy(css = "#jform_access_chzn .chzn-drop")
    private WebElement defaultAccessElements;

    @FindBy(id = "#jform_access_chzn .chzn-drop .chzn-results .active-result")
    private List<WebElement> defaultAccessList;

    @FindBy(css = "#jform_list_limit_chzn .chzn-single")
    private WebElement defaultListLimitDrop;

    @FindBy(css = "#jform_list_limit_chzn .chzn-drop")
    private WebElement defaultListLimitElements;

    @FindBy(id = "#jform_list_limit_chzn .chzn-drop .chzn-results .active-result")
    private List<WebElement> defaultListLimitList;

    @FindBy(id = "jform_MetaDesc")
    private WebElement siteMetaDescription;

    @FindBy(id = "jform_MetaKeys")
    private WebElement siteMetaKeywords;

    @FindBy(id = "jform_MetaRights")
    private WebElement contentRights;

    public void EditSiteSettings() {

    }
}
