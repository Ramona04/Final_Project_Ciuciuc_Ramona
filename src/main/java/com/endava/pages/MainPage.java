package com.endava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage {

    private WebDriver webDriver;

    public MainPage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(xpath = ".//*[@id='content']/div[3]/div[1]/h2")
    private WebElement pageLegend;

    @FindBy(css = ".btn.btn-primary")
    private WebElement logoutButton;

    @FindBy(css = ".tagspopular ul li a")
    private WebElement popularTags;

    @FindBy(css = ".latestnews li a span")
    private List<WebElement> latestArticles;

    @FindBy(css = ".item-102 a")
    private WebElement profile;

    @FindBy(css = ".item-104 a")
    private WebElement submitArticle;

    @FindBy(css = ".item-103 a")
    private WebElement admin;

    @FindBy(css = ".item-106 a")
    private WebElement templateSettings;

    @FindBy(css = ".item-107 a")
    private WebElement siteSettings;

    @FindBy(css = ".custom p img")
    private WebElement image;

    @FindBy(className = "item-page")
    private WebElement content;

    @FindBy(css = ".item-page .icons .btn-group .btn")
    private WebElement editContentButton;

    @FindBy(css = ".edit-icon a")
    private WebElement editContent;

    @FindBy(id = "mod-search-searchword93")
    private WebElement searchBox;

    @FindBy(id = "back-top")
    private WebElement backToTop;

    public PopularTagsPage SelectTag(String tagName){
        popularTags.click();
        PopularTagsPage popularTagsPage = PageFactory.initElements(webDriver, PopularTagsPage.class);
        return popularTagsPage;
    }

    public void SelectArticle(String articleName){
            for(int i = 0; i < latestArticles.size(); i++) {
                if (latestArticles.get(i).getText().equals(articleName)) {
                    latestArticles.get(i).click();
                }
            }
    }

    public ProfilePage Profile(){
        profile.click();
        ProfilePage profilePage = PageFactory.initElements(webDriver, ProfilePage.class);
        return profilePage;
    }

    public SubmitArticlePage SubmitArticle(){
        submitArticle.click();
        SubmitArticlePage submitArticlePage = PageFactory.initElements(webDriver, SubmitArticlePage.class);
        return submitArticlePage;
    }

    public SiteAdminPage SiteAdmin(){
        admin.click();
        SiteAdminPage siteAdminPage = PageFactory.initElements(webDriver, SiteAdminPage.class);
        return siteAdminPage;
    }

    public TemplateSettingsPage TemplateSettings(){
        templateSettings.click();
        TemplateSettingsPage templateSettingsPage = PageFactory.initElements(webDriver, TemplateSettingsPage.class);
        return templateSettingsPage;
    }

    public SiteSettingsPage SiteSettings(){
        siteSettings.click();
        SiteSettingsPage siteSettingsPage = PageFactory.initElements(webDriver, SiteSettingsPage.class);
        return siteSettingsPage;
    }

    public void waitUntilCompleteLoad(){
        WebDriverWait wait = new WebDriverWait(webDriver, 5000);
        wait.until(ExpectedConditions.visibilityOf(searchBox));
    }
}
