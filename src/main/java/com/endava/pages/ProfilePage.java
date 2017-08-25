package com.endava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProfilePage {
    private WebDriver webDriver;

    public ProfilePage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(xpath = ".//*[@id='member-profile']/fieldset[1]/legend")
    private WebElement pageLegend;

    //Edit profile fields

    @FindBy(id = "jform_name")
    private WebElement profileName;

    @FindBy(id = "jform_username")
    private WebElement profileUsername;

    @FindBy(id = "jform_password1")
    private WebElement profilePassword1;

    @FindBy(id = "jform_password2")
    private WebElement profilePassword2;

    @FindBy(id = "jform_email1")
    private WebElement profileEmail1;

    @FindBy(id = "jform_email2")
    private WebElement profileEmail2;

    //Basic settings

    @FindBy(xpath = ".//*[@id='jform_params_editor_chzn']/a")
    private WebElement editorDrop;

    @FindBy(xpath = ".//*[@id='jform_params_editor_chzn']/div")
    private WebElement editorDropdownElements;

    @FindBy(xpath = ".//*[@id='jform_params_editor_chzn']/div/ul/li")
    private List<WebElement> editorList;

    @FindBy(xpath = ".//*[@id='jform_params_timezone_chzn']/a")
    private WebElement timeZoneDrop;

    @FindBy(xpath = ".//*[@id='jform_params_timezone_chzn']/div/div/input")
    private WebElement timeZoneSearch;

    @FindBy(xpath = ".//*[@id='jform_params_language_chzn']/a")
    private WebElement frontendLanguageDrop;

    @FindBy(xpath = ".//*[@id='jform_params_language_chzn']/div")
    private WebElement frontendLanguageDropdownElements;

    @FindBy(xpath = ".//*[@id='jform_params_language_chzn']/div/ul/li")
    private List<WebElement> frontendLanguageList;

    @FindBy(xpath = ".//*[@id='jform_params_admin_style_chzn']/a")
    private WebElement backendTemplateDrop;

    @FindBy(xpath = ".//*[@id='jform_params_admin_style_chzn']/div")
    private WebElement backendTemplateDropdownElements;

    @FindBy(xpath = ".//*[@id='jform_params_admin_style_chzn']/div/ul/li")
    private List<WebElement> backendTemplateList;

    @FindBy(xpath = ".//*[@id='jform_params_admin_language_chzn']/a")
    private WebElement backendLanguageDrop;

    @FindBy(xpath = ".//*[@id='jform_params_admin_language_chzn']/div")
    private WebElement backendLanguageDropdownElements;

    @FindBy(xpath = ".//*[@id='jform_params_admin_language_chzn']/div/ul/li")
    private List<WebElement> backendLanguageList;

    @FindBy(xpath = ".//*[@id='jform_params_helpsite_chzn']/a")
    private WebElement helpSiteDrop;

    @FindBy(xpath = ".//*[@id='jform_params_helpsite_chzn']/div")
    private WebElement helpSiteDropdownElements;

    @FindBy(xpath = ".//*[@id='jform_params_helpsite_chzn']/div/ul/li")
    private List<WebElement> helpSiteList;

    @FindBy(id = "helpsite-refresh")
    private WebElement refreshButton;

    @FindBy(css = ".controls .btn[type='submit']")
    private WebElement submitProfileButton;

    @FindBy(css = ".controls .btn[title='Cancel']")
    private WebElement CancelEditButton;

    public Boolean CheckPage() {
        return pageLegend.getText().contains("Profile");
    }

    public void EditProfile(String pName, String pPassword, String pEmail) {
        if (profileName.isDisplayed()) {
            profileName.clear();
            profileName.sendKeys(pName);
        }

        if (profilePassword1.isDisplayed() && profilePassword2.isDisplayed()) {
            profilePassword1.sendKeys(pPassword);
            profilePassword2.sendKeys(pPassword);
        }
        if (profileEmail1.isDisplayed() && profileEmail2.isDisplayed()) {
            profileEmail1.clear();
            profileEmail1.sendKeys(pEmail);
            profileEmail2.clear();
            profileEmail2.sendKeys(pEmail);
        }

    }

    public void Editor(String editorOption, String timeZoneOption, String frontEndOption, String backendLanguageOption, String backendTemplateOption, String helpSiteOption) {
        editorDrop.click();
        if (editorDropdownElements.isDisplayed()) {
            for (int i = 0; i < editorList.size(); i++) {
                if (editorList.get(i).getText().equals(editorOption)) {
                    editorList.get(i).click();
                }
            }
        }
        timeZoneDrop.click();
        if (timeZoneSearch.isDisplayed()) {
            timeZoneSearch.sendKeys(timeZoneOption);
            timeZoneSearch.sendKeys(Keys.ENTER);
        }
        frontendLanguageDrop.click();
        if (frontendLanguageDropdownElements.isDisplayed()) {
            for (int i = 0; i < frontendLanguageList.size(); i++) {
                if (frontendLanguageList.get(i).getText().equals(frontEndOption)) {
                    frontendLanguageList.get(i).click();
                }
            }
        }
        backendTemplateDrop.click();
        if (backendTemplateDropdownElements.isDisplayed()) {
            for (int i = 0; i < backendTemplateList.size(); i++) {
                if (backendTemplateList.get(i).getText().equals(backendTemplateOption)) {
                    backendTemplateList.get(i).click();
                }
            }
        }
        backendLanguageDrop.click();
        if (backendLanguageDropdownElements.isDisplayed()) {
            for (int i = 0; i < backendLanguageList.size(); i++) {
                if (backendLanguageList.get(i).getText().equals(backendLanguageOption)) {
                    backendLanguageList.get(i).click();
                }
            }
        }
        helpSiteDrop.click();
        if (helpSiteDropdownElements.isDisplayed()) {
            for (int i = 0; i < helpSiteList.size(); i++) {
                if (helpSiteList.get(i).getText().equals(helpSiteOption)) {
                    helpSiteList.get(i).click();
                }
            }
        }
        submitProfileButton.click();


    }
}
