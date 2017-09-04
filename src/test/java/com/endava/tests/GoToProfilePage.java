package com.endava.tests;

import com.endava.pages.ProfilePage;
import org.junit.Assert;
import org.junit.Test;

public class GoToProfilePage extends TestClass {
    @Test
    public void SelectArticleTest() {
        ProfilePage profilePage = mainPage.Profile();
        Assert.assertTrue(profilePage.CheckPage());
        profilePage.EditProfile();
        profilePage.Editor();
    }


}

