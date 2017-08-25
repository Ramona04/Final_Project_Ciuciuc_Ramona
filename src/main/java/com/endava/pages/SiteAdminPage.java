package com.endava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiteAdminPage {
    WebDriver webDriver;

    public SiteAdminPage(WebDriver driver) {
        this.webDriver = driver;
    }

    @FindBy(id = "mod-login-username")
    private WebElement adminUsername;

    @FindBy(id = "mod-login-password")
    private WebElement adminPassword;

    @FindBy(css = ".btn.btn-primary.btn-block.btn-large.login-button")
    private WebElement adminLoginButton;

    public void SendAdminCredentials(String user, String password) {
        adminUsername.sendKeys(user);
        adminPassword.sendKeys(password);
        adminLoginButton.click();
    }
}
