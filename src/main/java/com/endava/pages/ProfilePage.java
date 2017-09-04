package com.endava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class ProfilePage {

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

    private WebDriver webDriver;

    public ProfilePage(WebDriver driver) {
        this.webDriver = driver;
    }

    Properties properties = new Properties();
    InputStream input = null;

    public Boolean CheckPage() {
        return pageLegend.getText().contains("Profile");
    }

    public void EditProfile() {

        try {
            input = new FileInputStream("C:\\Users\\rciuciuc\\Desktop\\Homework and Materials\\FinalProject\\src\\main\\resources\\config.properties");
            properties.load(input);

            if (profileName.isDisplayed()) {
                profileName.clear();
                profileName.sendKeys(properties.getProperty("pName"));
            }

            if (profilePassword1.isDisplayed() && profilePassword2.isDisplayed()) {
                profilePassword1.sendKeys(properties.getProperty("pPassword"));
                profilePassword2.sendKeys(properties.getProperty("pPassword"));
            }
            if (profileEmail1.isDisplayed() && profileEmail2.isDisplayed()) {
                profileEmail1.clear();
                profileEmail1.sendKeys(properties.getProperty("pEmail"));
                profileEmail2.clear();
                profileEmail2.sendKeys(properties.getProperty("pEmail"));
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public void Editor() {
        try {
            input = new FileInputStream("C:\\Users\\rciuciuc\\Desktop\\Homework and Materials\\FinalProject\\src\\main\\resources\\config.properties");
            properties.load(input);

            editorDrop.click();
            if (editorDropdownElements.isDisplayed()) {
                for (int i = 0; i < editorList.size(); i++) {
                    if (editorList.get(i).getText().equals(properties.getProperty("editorOption"))) {
                        editorList.get(i).click();
                    }
                }
            }
            timeZoneDrop.click();
            if (timeZoneSearch.isDisplayed()) {
                timeZoneSearch.sendKeys(properties.getProperty("timeZoneOption"));
                timeZoneSearch.sendKeys(Keys.ENTER);
            }
            frontendLanguageDrop.click();
            if (frontendLanguageDropdownElements.isDisplayed()) {
                for (int i = 0; i < frontendLanguageList.size(); i++) {
                    if (frontendLanguageList.get(i).getText().equals(properties.getProperty("frontEndOption"))) {
                        frontendLanguageList.get(i).click();
                    }
                }
            }
            backendTemplateDrop.click();
            if (backendTemplateDropdownElements.isDisplayed()) {
                for (int i = 0; i < backendTemplateList.size(); i++) {
                    if (backendTemplateList.get(i).getText().equals(properties.getProperty("backendTemplateOption"))) {
                        backendTemplateList.get(i).click();
                    }
                }
            }
            backendLanguageDrop.click();
            if (backendLanguageDropdownElements.isDisplayed()) {
                for (int i = 0; i < backendLanguageList.size(); i++) {
                    if (backendLanguageList.get(i).getText().equals(properties.getProperty("backendLanguageOption"))) {
                        backendLanguageList.get(i).click();
                    }
                }
            }
            helpSiteDrop.click();
            if (helpSiteDropdownElements.isDisplayed()) {
                for (int i = 0; i < helpSiteList.size(); i++) {
                    if (helpSiteList.get(i).getText().equals(properties.getProperty("helpSiteOption"))) {
                        helpSiteList.get(i).click();
                    }
                }
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

        submitProfileButton.click();


    }
}
