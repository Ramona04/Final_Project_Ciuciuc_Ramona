package com.endava.tests;

import com.endava.pages.ProfilePage;
import com.endava.pages.SubmitArticlePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class SubmitArticleTest extends TestClass {
    @Test
    public void SubmitArticleTest() {
        SubmitArticlePage submitArticlePage = mainPage.SubmitArticle();
        submitArticlePage.FormatFont("Italic");
        submitArticlePage.FormatText("Align right");
        submitArticlePage.WriteArticle("10 Books you need to read this summer", "Books2", "lorem opsum dolorem bla bla bla");
        //submitArticlePage.InsertImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTozkxoNSH8739juRXJJX5JxREAB6I30bFyexPoCdRVa2fKfH2d");

        //submitArticlePage.SelectOption("Metadata");


        Assert.assertEquals("10 Books you need to read this summer", submitArticlePage.GetSubmittedArticleName());
    }

}
