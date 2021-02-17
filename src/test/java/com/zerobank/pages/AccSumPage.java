package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccSumPage extends BasePage{

    @FindBy(id="searchTerm")
    public WebElement search;

    @FindBy(css = "html>body>div>div:nth-of-type(2)>div")
    public List<WebElement> message;

    @FindBy(xpath="//*[@id=\"homeMenu\"]/div/strong")
    public WebElement homeBtn;



}
