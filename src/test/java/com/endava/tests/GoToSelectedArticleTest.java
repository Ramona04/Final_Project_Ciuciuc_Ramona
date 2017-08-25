package com.endava.tests;

import com.endava.pages.LatestArticlesPage;
import com.endava.pages.PopularTagsPage;
import com.endava.pages.ProfilePage;
import com.endava.pages.SubmitArticlePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class GoToSelectedArticleTest extends TestClass {
    @Test
    public void SelectArticleTest() {
        mainPage.SelectArticle("My first Article");
    }
}
