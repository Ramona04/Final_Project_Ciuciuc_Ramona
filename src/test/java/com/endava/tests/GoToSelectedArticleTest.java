package com.endava.tests;

import com.endava.pages.SelectedArticlePage;
import org.junit.Assert;
import org.junit.Test;

public class GoToSelectedArticleTest extends TestClass {
    @Test
    public void SelectArticleTest() {
        SelectedArticlePage selectedArticlePage = mainPage.SelectArticle("My first Article");
        Assert.assertEquals("My first Article", selectedArticlePage.GetArticleTitle());
    }
}
