package com.endava.tests;

import com.endava.pages.LoginPage;
import com.endava.pages.MainPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
    protected static LoginPage loginPage;
    protected static MainPage mainPage;
    private static WebDriver webDriver;

    @BeforeClass
    public static void before() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/rciuciuc/AppData/Roaming/Skype/My Skype Received Files/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://localhost:81/joomla/");
        loginPage = PageFactory.initElements(webDriver, LoginPage.class);
        mainPage = PageFactory.initElements(webDriver, MainPage.class);
        MainPage mainPage = loginPage.SendCredentials("ramona", "Password123");
    }

//    @AfterClass
//    public static void after() {
//        webDriver.close();
//    }
}
