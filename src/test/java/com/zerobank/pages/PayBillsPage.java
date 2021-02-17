package com.zerobank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PayBillsPage extends BasePage{



    @FindBy(id="pc_currency")
    public WebElement selectone;

    @FindBy(xpath="//*[@id=\"pc_currency\"]/option[7] ")
    public WebElement selectoneCurrency;

    @FindBy(xpath="//*[@id='pc_currency']/option")
    public List<WebElement> currencies;

    @FindBy(css="div#tabs > ul")
    public WebElement purchaseForeign;

    @FindBy(css="input#pc_calculate_costs")
    public WebElement calculate;

    @FindBy(id="alertBox")
    public WebElement alert;






}
