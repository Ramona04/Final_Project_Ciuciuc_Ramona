package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SiteAdminPage {

    @FindBy(id = "mod-login-username")
    private WebElement adminUsername;

    @FindBy(id = "mod-login-password")
    private WebElement adminPassword;

    @FindBy(css = ".btn.btn-primary.btn-block.btn-large.login-button")
    private WebElement adminLoginButton;

    @FindBy(className = "page-title")
    private WebElement pageTitle;

    WebDriver webDriver;

    public SiteAdminPage(WebDriver driver) {
        this.webDriver = driver;
    }

    public String GetPageTitle() {
        return pageTitle.getText();
    }

    public void SendAdminCredentials() {

        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\Users\\rciuciuc\\Desktop\\Homework and Materials\\FinalProject\\src\\main\\resources\\config.properties");
            properties.load(input);

            adminUsername.sendKeys(properties.getProperty("username"));
            adminPassword.sendKeys(properties.getProperty("password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        adminLoginButton.click();
    }
}
