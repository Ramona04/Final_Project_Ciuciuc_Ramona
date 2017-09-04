package com.endava.tests;

import com.endava.pages.PopularTagsPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class GoToSelectedTagTest extends TestClass {
    @Test
    public void SelectTagTest() {
        PopularTagsPage popularTagsPage = mainPage.SelectTag("Joomla");
        Assert.assertEquals("Getting Started", popularTagsPage.GetTagName());
    }
}
