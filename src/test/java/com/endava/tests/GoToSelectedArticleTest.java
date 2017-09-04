package com.endava.tests;

import com.endava.pages.SelectedArticlePage;
import org.junit.Assert;
import org.junit.Test;

public class GoToSelectedArticleTest extends TestClass {
    @Test
    public void SelectArticleTest() {
        SelectedArticlePage selectedArticlePage = mainPage.SelectArticle("10 Books you need to read this summer");
        Assert.assertEquals("10 Books you need to read this summer", selectedArticlePage.GetArticleTitle());
    }
}
