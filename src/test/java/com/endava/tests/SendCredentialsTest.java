package com.endava.tests;

import com.endava.pages.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class SendCredentialsTest extends TestClass {
    @Test
    public void LoginTest() {
        Assert.assertEquals("ramona's Site!", loginPage.CheckSiteTitle());
        Assert.assertEquals("Home", loginPage.CheckCurentPage());

        mainPage.Logout();
        //Assert.assertTrue(loginPage.CheckForgotPassword());
        //Assert.assertTrue(loginPage.CheckForgotUsername());
    }
}
