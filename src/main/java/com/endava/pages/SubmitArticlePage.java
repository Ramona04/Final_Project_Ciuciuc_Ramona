package com.endava.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class SubmitArticlePage {

    @FindBy(css = ".latestnews li a span")
    private List<WebElement> submittedArticlesList;

    //Content tab
    @FindBy(css = "#com-content-formTabs li a")
    private List<WebElement> articleOptions;

    @FindBy(id = "jform_title")
    private WebElement articleTitle;

    @FindBy(id = "jform_alias")
    private WebElement articleAlias;

    @FindBy(css = "iframe#jform_articletext_ifr")
    private WebElement articleFrame;

    @FindBy(css = "#mceu_93")
    private WebElement textBox;

    @FindBy(id = "mceu_95")
    private WebElement enableTextBox;

    @FindBy(xpath = "//*[@id='adminForm']/div/div[1]/button")
    private WebElement saveArticleButton;

    @FindBy(xpath = "//*[@id='adminForm']/div/div[2]/button")
    private WebElement cancelArticleButton;

//Format text options

    @FindBy(css = "#mceu_67-body div")
    private List<WebElement> fontStyleOptions;

    @FindBy(css = "#mceu_68-body div")
    private List<WebElement> alignmentOptions;

//Insert Image

    @FindBy(css = "#mceu_54 button")
    private WebElement insertImage;

    @FindBy(css = "#mceu_103-body iframe")
    private WebElement insertImageWindow;

    @FindBy(css = "#f_url")
    private WebElement imageSource;

    @FindBy(css = "#f_alt")
    private WebElement imageDescription;

    @FindBy(css = "#f_caption")
    private WebElement imageCaption;

    @FindBy(css = "#f_title")
    private WebElement imageTitle;

    @FindBy(css = "#f_caption_class")
    private WebElement imageClass;

    @FindBy(css = "#upload-submit")
    private WebElement insertImageButton;

    @FindBy(css = "#mceu_184 button")
    private WebElement closeImageWindow;

    private WebDriver webDriver;

    public SubmitArticlePage(WebDriver driver) {
        this.webDriver = driver;
    }

    public String GetArticleName(){
        return articleTitle.getText();
    }

    public String GetSubmittedArticleName(){
        return submittedArticlesList.get(0).getText();
    }

//Format text
    public void FormatFont(String font){
        for(int i = 0; i < fontStyleOptions.size(); i++){
            if(fontStyleOptions.get(i).getAttribute("aria-label").equals(font)){
                fontStyleOptions.get(i).click();
                break;
            }
        }
    }

    public void FormatText(String align){
        for(int i = 0; i < alignmentOptions.size(); i++){
            if(alignmentOptions.get(i).getAttribute("aria-label").equals(align)){
                alignmentOptions.get(i).click();
                break;
            }
        }
    }

//Write article
    public void WriteArticle(String title, String alias, String text){
        if(articleTitle.isEnabled()){
            articleTitle.sendKeys(title);
        }
        if(articleAlias.isEnabled()){
            articleAlias.sendKeys(alias);
        }
        webDriver.switchTo().frame(articleFrame);
        webDriver.findElement(By.id("tinymce")).sendKeys(text);
        webDriver.switchTo().defaultContent();
        saveArticleButton.click();
    }
//Insert image
//    public void InsertImage(String source){
//        insertImage.click();
//        webDriver.switchTo().frame(insertImageWindow);
//        webDriver.findElement(By.xpath(".//div[contains(@class,'controls')]/input[@id='f_url']")).sendKeys(source);
//        webDriver.findElement(By.cssSelector(".btn.btn-success.button-save-selected")).click();
//        webDriver.switchTo().defaultContent();
//    }


//Select option
    public void SelectOption(String option){
        for(int i = 0; i < articleOptions.size(); i++){
            if(articleOptions.get(i).getText().equals(option)){
                articleOptions.get(i).click();
                break;
            }
        }
    }
}
