package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginPage {

    @FindBy(className = "site-title")
    private WebElement siteTitle;

    @FindBy(id = "modlgn-username")
    private WebElement username;

    @FindBy(id = "modlgn-passwd")
    private WebElement password;

    @FindBy(id = "modlgn-remember")
    private WebElement rememberCheckBox;

    @FindBy(xpath = "//div[contains(@class,'controls')]/button")
    private WebElement loginButton;

    @FindBy(css = ".unstyled li a[href='/joomla/index.php/component/users/?view=remind&Itemid=101']")
    private WebElement forgotUsername;

    @FindBy(css = ".unstyled li a[href='/joomla/index.php/component/users/?view=reset&Itemid=101']")
    private WebElement forgotPassword;

    @FindBy(xpath = "//li[contains(@class,'active')]/span")
    private WebElement curentPage;

    private WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public String CheckSiteTitle() {
        return siteTitle.getText();
    }

    public String CheckCurentPage() {
        return curentPage.getText();
    }

    public Boolean CheckForgotUsername() {
        return forgotUsername.isEnabled();
    }

    public Boolean CheckForgotPassword() {
        return forgotPassword.isEnabled();
    }

    public MainPage SendCredentials() {

        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\Users\\rciuciuc\\Desktop\\Homework and Materials\\FinalProject\\src\\main\\resources\\config.properties");
            properties.load(input);

            username.sendKeys( properties.getProperty("username"));
            password.sendKeys(properties.getProperty("password"));

        }catch (IOException ex){
            ex.printStackTrace();
        }

        rememberCheckBox.click();
        loginButton.click();

        MainPage mainPage = PageFactory.initElements(webDriver, MainPage.class);
        mainPage.waitUntilCompleteLoad();
        return mainPage;
    }

}

