package com.endava.tests;

import com.endava.pages.ProfilePage;
import com.endava.pages.SiteAdminPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SiteAdminTest extends TestClass {
    @Test
    public void SiteAdminTest() {
        SiteAdminPage siteAdminPage = mainPage.SiteAdmin();
        siteAdminPage.SendAdminCredentials();
        Assert.assertEquals("Control Panel", siteAdminPage.GetPageTitle());
    }
}
