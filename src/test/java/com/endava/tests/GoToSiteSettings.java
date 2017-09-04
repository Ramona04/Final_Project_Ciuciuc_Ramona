package com.endava.tests;

import com.endava.pages.SiteSettingsPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class GoToSiteSettings extends TestClass {
    @Test
    public void SelectTagTest() {
        SiteSettingsPage siteSettingsPage = mainPage.SiteSettings();
        Assert.assertEquals("Site Settings", siteSettingsPage.getTitle());
    }
}
